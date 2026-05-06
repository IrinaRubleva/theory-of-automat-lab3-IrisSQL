package model.ast.helper;

import model.ast.helper.ExprJoin.JoinType;

import parser.IrisSQLParser;
import model.ast.ASTVisitor;
import java.util.*;

public class ExprSelect {

    private final ExprEvaluator eval;
    private final ASTVisitor visitor;
    private final ExprJoin join;


    public ExprSelect(ExprEvaluator eval, ASTVisitor visitor) {
        this.eval = eval;
        this.visitor = visitor;
        this.join = new ExprJoin(eval, visitor);
    }

    public Object visitSelect(IrisSQLParser.SelectContext ctx) {
        List<Map<String, Object>> workingSet = getWorkingSet(ctx);
        workingSet = applyWhere(workingSet, ctx.whereClause());

        List<Map<String, Object>> result;
        if (ctx.groupByClause() != null) {
            result = applyGroupBy(workingSet, ctx.groupByClause(), ctx.projection());
        } else {
            result = applyProjection(workingSet, ctx.projection());
        }
        applyOrderBy(result, ctx.orderClause());
        applySkipLimit(result, ctx.skipClause(), ctx.limitClause());

        return result;
    }




    private List<Map<String, Object>> getWorkingSet(IrisSQLParser.SelectContext ctx) {
        List<Map<String, Object>> workingSet = visitor.getTableData(ctx.tableRef());
        for (IrisSQLParser.JoinClauseContext joinCtx : ctx.joinClause()) {
            List<Map<String, Object>> right = visitor.getTableData(joinCtx.tableRef());
            IrisSQLParser.ExprContext joinCondition = joinCtx.expr();
            JoinType type = join.getJoinType(joinCtx);
            workingSet = join.applyJoin(workingSet, right, joinCondition, type);
        }
        return workingSet;
    }


    private List<Map<String, Object>> applyWhere(List<Map<String, Object>> rows,
                                                 IrisSQLParser.WhereClauseContext whereCtx) {
        if (whereCtx == null) return rows;
        List<Map<String, Object>> filtered = new ArrayList<>();
        for (Map<String, Object> row : rows) {
            Object cond = eval.eval(whereCtx.expr(), row);
            if (eval.toBoolean(cond)) {
                filtered.add(row);
            }
        }
        return filtered;
    }

    private List<Map<String, Object>> applyProjection(List<Map<String, Object>> rows,
                                                      IrisSQLParser.ProjectionContext projCtx) {
        List<Map<String, Object>> result = new ArrayList<>();
        if (projCtx.STAR() != null) {
            result.addAll(rows);
        } else {
            for (Map<String, Object> row : rows) {
                Map<String, Object> newRow = new LinkedHashMap<>();
                for (IrisSQLParser.SelectItemContext item : projCtx.selectItem()) {
                    Object value = eval.eval(item.expr(), row);
                    String name = item.name() != null ? item.name().getText() : item.expr().getText();
                    newRow.put(name, value);
                }
                result.add(newRow);
            }
        }
        return result;
    }


    private List<Map<String, Object>> applyGroupBy(List<Map<String, Object>> rows,
                                                   IrisSQLParser.GroupByClauseContext groupByCtx,
                                                   IrisSQLParser.ProjectionContext projCtx) {
        //Группировка
        List<String> groupCols = new ArrayList<>();
        for (IrisSQLParser.NameContext n : groupByCtx.columnList().name()) {
            groupCols.add(n.getText());
        }
        Map<String, List<Map<String, Object>>> groups = new LinkedHashMap<>();
        for (Map<String, Object> row : rows) {
            String key = buildGroupKey(row, groupCols);
            groups.computeIfAbsent(key, k -> new ArrayList<>()).add(row);
        }

        //Агрегация по группам
        List<Map<String, Object>> groupedResult = new ArrayList<>();
        for (List<Map<String, Object>> groupRows : groups.values()) {
            Map<String, Object> newRow = new LinkedHashMap<>();
            for (IrisSQLParser.SelectItemContext item : projCtx.selectItem()) {
                Object value;
                if (item.expr().funcCall() != null) {
                    value = eval.evalAggregate(item.expr().funcCall(), groupRows);
                } else {
                    value = eval.eval(item.expr(), groupRows.get(0));
                }
                String name = item.name() != null ? item.name().getText() : item.expr().getText();
                newRow.put(name, value);
            }
            groupedResult.add(newRow);
        }
        return groupedResult;
    }

    private String buildGroupKey(Map<String, Object> row, List<String> groupCols) {
        StringBuilder keyBuilder = new StringBuilder();
        for (String col : groupCols) {
            keyBuilder.append(row.get(col)).append("|");
        }
        return keyBuilder.toString();
    }

    private void applyOrderBy(List<Map<String, Object>> rows, IrisSQLParser.OrderClauseContext orderCtx) {
        if (orderCtx == null) return;
        rows.sort((row1, row2) -> {
            for (IrisSQLParser.OrderItemContext item : orderCtx.orderItem()) {
                String column = item.name().getText();
                Comparable v1 = (Comparable) row1.get(column);
                Comparable v2 = (Comparable) row2.get(column);
                int cmp = compareNullsLast(v1, v2);
                if (item.DESC() != null) cmp = -cmp;
                if (cmp != 0) return cmp;
            }
            return 0;
        });
    }

    private int compareNullsLast(Comparable a, Comparable b) {
        if (a == null && b == null) return 0;
        if (a == null) return -1;
        if (b == null) return 1;
        return a.compareTo(b);
    }


    private void applySkipLimit(List<Map<String, Object>> rows,
                                IrisSQLParser.SkipClauseContext skipCtx,
                                IrisSQLParser.LimitClauseContext limitCtx) {
        int skip = 0;
        if (skipCtx != null) {
            skip = Integer.parseInt(skipCtx.INTEGER_NUM().getText());
        }
        if (skip > 0) {
            if (skip < rows.size()) {
                rows.subList(0, skip).clear();
            } else {
                rows.clear();
            }
        }
        if (limitCtx != null) {
            int limit = Integer.parseInt(limitCtx.INTEGER_NUM().getText());
            if (limit < rows.size()) {
                rows.subList(limit, rows.size()).clear();
            }
        }
    }
}



