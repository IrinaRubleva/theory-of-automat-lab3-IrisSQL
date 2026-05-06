package model.ast;



import model.ast.helper.ExprEvaluator;
import model.ast.helper.ExprSelect;
import model.ast.helper.ExprJoin;
import parser.*;
import java.util.*;
import java.util.Collections;

public class ASTVisitor extends IrisSQLBaseVisitor<Object> {

    private final DatabaseManager manager = new DatabaseManager();
    private Database currentDb;

    //вынесла логику
    private final ExprEvaluator eval = new ExprEvaluator();
    private final ExprSelect select;
    private final ExprJoin join;

    public ASTVisitor() {
        this.select = new ExprSelect(eval, this);
        this.join = new ExprJoin(eval, this);
    }

    @Override
    public Object visitProg(IrisSQLParser.ProgContext ctx) {
        return visit(ctx.request());
    }

    @Override
    public Object visitCreateTable(IrisSQLParser.CreateTableContext ctx) {

        String name = ctx.name().getText();

        List<Column> columns = new ArrayList<>();

        for (var colCtx : ctx.columnDef()) {

            String colName = colCtx.name().getText();
            DataType type = parseType(colCtx.dataType());
            Column col = new Column(colName, type);

            for (var mod : colCtx.columnModifier()) {
                String m = mod.getText().toUpperCase();

                if (m.equals("PRIMARYKEY")) col.primaryKey = true;
                if (m.equals("UNIQUE")) col.unique = true;
                if (m.equals("NOTNULL")) col.notNull = true;
            }

            columns.add(col);
        }

        IndexType indexType = IndexType.NONE;
        if (ctx.indexType() != null) {
            String type = ctx.indexType().getText().toUpperCase();
            switch (type) {
                case "ORDER": indexType = IndexType.ORDER; break;
                case "HASH":  indexType = IndexType.HASH;  break;
                case "TREE":  indexType = IndexType.TREE;  break;
            }
        }

        if (indexType != IndexType.NONE) {
            boolean hasPrimaryKey = columns.stream().anyMatch(col -> col.primaryKey);
            if (!hasPrimaryKey) {
                throw new RuntimeException("Cannot create indexed table without PRIMARY KEY");
            }
        }

        Table table = new Table(name, columns, indexType);

        currentDb.createTable(table);

        return "TABLE CREATED";
    }


    @Override
    public Object visitInsert(IrisSQLParser.InsertContext ctx) {
        String tableName = ctx.name().getText();
        System.out.println("Insert into table: " + tableName);
        Table table = currentDb.getTable(tableName);
        System.out.println("Table columns: " + table.columns);

        List<Object> values = new ArrayList<>();

        for (IrisSQLParser.ExprContext expr : ctx.expr()) {
            values.add(eval.eval(expr, Collections.emptyMap()));
        }

        table.insert(values);

        return "INSERT OK";
    }

    @Override
    public Object visitSelect(IrisSQLParser.SelectContext ctx) {
        return  select.visitSelect(ctx);
    }




    @Override
    public Object visitName(IrisSQLParser.NameContext ctx) {
        return ctx.getText();
    }


    @Override
    public Object visitCreateDataBase(IrisSQLParser.CreateDataBaseContext ctx) {

        String name = ctx.name().getText();
        manager.createDatabase(name);
        currentDb = manager.getDatabase(name);

        return "DB CREATED: " + name;
    }

    @Override
    public Object visitDropDataBase(IrisSQLParser.DropDataBaseContext ctx) {

        String name = ctx.name().getText();
        manager.dropDatabase(name);

        if (currentDb != null && currentDb.getName().equals(name)) {
            currentDb = null;
        }


        return "DB DROPPED: " + name;
    }

    @Override
    public Object visitAlter(IrisSQLParser.AlterContext ctx) {

        Table table = currentDb.getTable(ctx.name(0).getText());

        if (ctx.ADD() != null) {

            Column col = buildColumn(ctx.columnDef());
            table.addColumn(col);

            return "COLUMN ADDED";
        }

        if (ctx.DROP() != null) {

            table.dropColumn(ctx.name(1).getText());
            return "COLUMN DROPPED";
        }

        if (ctx.EDIT() != null) {

            Column col = buildColumn(ctx.columnDef());
            table.editColumn(col);

            return "COLUMN EDITED";
        }

        return null;
    }

    @Override
    public Object visitDelete(IrisSQLParser.DeleteContext ctx) {

        String tableName = ctx.name().getText();
        Table table = currentDb.getTable(tableName);

        Iterator<Map<String, Object>> it = table.rows.iterator();

        int removed = 0;

        while (it.hasNext()) {
            Map<String, Object> row = it.next();

            if (ctx.whereClause() != null) {
                Object cond = eval.eval(ctx.whereClause().expr(), row);
                if (!eval.toBoolean(cond)) continue;
            }

            it.remove();
            removed++;
        }

        return "DELETED: " + removed;
    }


    private Column buildColumn(IrisSQLParser.ColumnDefContext ctx) {

        Column col = new Column(
                ctx.name().getText(),
                parseType(ctx.dataType())
        );

        for (var mod : ctx.columnModifier()) {
            String m = mod.getText().toUpperCase();

            if (m.equals("PRIMARYKEY")) col.primaryKey = true;
            if (m.equals("UNIQUE")) col.unique = true;
            if (m.equals("NOTNULL")) col.notNull = true;
        }

        return col;
    }

    private DataType parseType(IrisSQLParser.DataTypeContext ctx) {

        if (ctx.INTEGER_TYPE() != null) return DataType.INTEGER;
        if (ctx.REAL_TYPE() != null) return DataType.REAL;
        if (ctx.TEXT() != null) return DataType.TEXT;
        if (ctx.LOGIC() != null) return DataType.LOGIC;

        throw new RuntimeException("Unknown type");
    }

    public List<Map<String, Object>> getTableData(IrisSQLParser.TableRefContext ctx) {
        String tableName = ctx.getText();
        Table table = currentDb.getTable(tableName);
        if (table == null) {
            throw new RuntimeException("Table not found: " + tableName);
        }
        return table.rows;
    }

    public Map<String, Object> mergeRows(Map<String, Object> left, Map<String, Object> right, String rightPrefix) {
        Map<String, Object> result = new LinkedHashMap<>();

        result.putAll(left);

        for (String k : right.keySet()) {
            String key = result.containsKey(k) ? rightPrefix + "." + k : k;
            result.put(key, right.get(k));
        }

        return result;
    }

    public Map<String, Object> emptyRow(List<Map<String, Object>> table) {

        Map<String, Object> row = new LinkedHashMap<>();

        if (table.isEmpty()) return row;

        for (String k : table.get(0).keySet()) {
            row.put(k, null);
        }

        return row;
    }

    private boolean isAggregate(IrisSQLParser.ExprContext ctx) {
        return ctx.funcCall() != null;
    }
}




