package model.ast;

import parser.*;
import java.util.*;

public class ASTVisitor extends IrisSQLBaseVisitor<Object> {

    private final Database db = new Database();

    @Override
    public Object visitProg(IrisSQLParser.ProgContext ctx) {
        return visit(ctx.request());
    }

    @Override
    public Object visitCreateTable(IrisSQLParser.CreateTableContext ctx) {

        String tableName = ctx.name().getText();
        List<String> columns = new ArrayList<>();

        for (IrisSQLParser.ColumnDefContext col : ctx.columnDef()) {
            columns.add(col.name().getText());
        }

        db.createTable(tableName, columns);
        return "TABLE CREATED: " + tableName;
    }

    @Override
    public Object visitInsert(IrisSQLParser.InsertContext ctx) {
        String tableName = ctx.name().getText();
        System.out.println("Insert into table: " + tableName);
        Table table = db.getTable(tableName);
        System.out.println("Table columns: " + table.columns);

        List<Object> values = new ArrayList<>();

        for (IrisSQLParser.ExprContext expr : ctx.expr()) {
            values.add(visit(expr));
        }

        table.insert(values);

        return "INSERT OK";
    }

    @Override
    public Object visitSelect(IrisSQLParser.SelectContext ctx) {

        String tableName = ctx.tableRef().getText();

        return db.selectAll(tableName);
    }

    @Override
    public Object visitLiteral(IrisSQLParser.LiteralContext ctx) {

        if (ctx.INTEGER_NUM() != null) {
            return Integer.parseInt(ctx.INTEGER_NUM().getText().replace("_", ""));
        }

        if (ctx.REAL_NUM() != null) {
            return Double.parseDouble(ctx.REAL_NUM().getText().replace("_", ""));
        }

        if (ctx.STRING() != null) {
            String raw = ctx.STRING().getText();
            return raw.substring(1, raw.length() - 1);
        }

        if (ctx.TRUE() != null) return true;
        if (ctx.FALSE() != null) return false;
        if (ctx.NULL() != null) return null;

        return null;
    }

    @Override
    public Object visitName(IrisSQLParser.NameContext ctx) {
        return ctx.getText();
    }
}




