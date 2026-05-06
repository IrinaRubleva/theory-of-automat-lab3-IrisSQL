package model.ast.helper;

import parser.IrisSQLParser;
import java.util.Map;
import java.util.List;

public class ExprEvaluator {

    public Object eval(IrisSQLParser.ExprContext ctx, Map<String, Object> row) {
        if (ctx.literal() != null) {return visitLiteral(ctx.literal());}

        if (ctx.name() != null) {
            String col = ctx.name().getText();
            if (!row.containsKey(col)) {
                throw new RuntimeException("Unknown column: " + col);
            }
            return row.get(col);
        }

        if (ctx.NOT() != null) { return !toBoolean(eval(ctx.expr(0), row));}

        if (ctx.expr().size() == 1) {
            return eval(ctx.expr(0), row);
        }

        // function call
        if (ctx.funcCall() != null) {
            IrisSQLParser.FuncCallContext f = ctx.funcCall();
            String func = f.name().getText().toLowerCase();
            if (func.equals("matches")) {
                String regex = (String) eval(f.expr(0), row);
                Object val = eval(f.expr(1), row);
                return val != null && ((String) val).matches(regex);
            }
            throw new RuntimeException("Unknown function: " + func);
        }

        Object left = eval(ctx.expr(0), row);
        Object right = eval(ctx.expr(1), row);

        String op = ctx.op.getText();

        switch (op) {

            case "+":
                return toNumber(left) + toNumber(right);
            case "-":
                return toNumber(left) - toNumber(right);
            case "*":
                return toNumber(left) * toNumber(right);
            case "/":
                return toNumber(left) / toNumber(right);
            case "%":
                return toNumber(left) % toNumber(right);
            case "=":
                return areEqual(left, right);

            case "<>":
                return !areEqual(left, right);

            case ">":
                return toNumber(left) > toNumber(right);
            case "<":
                return toNumber(left) < toNumber(right);
            case ">=":
                return toNumber(left) >= toNumber(right);
            case "<=":
                return toNumber(left) <= toNumber(right);

            case "AND":
            case "and":
                return toBoolean(left) && toBoolean(right);

            case "OR":
            case "or":
                return toBoolean(left) || toBoolean(right);
        }

        throw new RuntimeException("Unknown operator: " + op);
    }


    public boolean toBoolean(Object o) {
        if (o == null) return false;
        if (o instanceof Boolean) return (Boolean) o;
        throw new RuntimeException("Not a boolean: " + o);
    }

    private double toNumber(Object o) {
        if (o instanceof Integer) return ((Integer) o).doubleValue();
        if (o instanceof Double) return (Double) o;
        throw new RuntimeException("Not a number: " + o);
    }

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

    public boolean areEqual(Object a, Object b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;

        if (a instanceof Number && b instanceof Number) {
            return ((Number) a).doubleValue() == ((Number) b).doubleValue();
        }

        return a.equals(b);
    }


    public Object evalAggregate(IrisSQLParser.FuncCallContext ctx,
                                 List<Map<String, Object>> rows) {

        String func = ctx.name().getText().toLowerCase();

        switch (func) {

            case "count":
                return rows.size();

            case "sum": {
                double sum = 0;
                for (Map<String, Object> row : rows) {
                    Object val = eval(ctx.expr(0), row);
                    if (val != null) {
                        sum += ((Number) val).doubleValue();
                    }
                }
                return sum;
            }

            case "min": {
                Double min = null;
                for (Map<String, Object> row : rows) {
                    Object val = eval(ctx.expr(0), row);
                    if (val == null) continue;
                    double v = ((Number) val).doubleValue();
                    if (min == null || v < min) min = v;
                }
                return min;
            }

            case "max": {
                Double max = null;
                for (Map<String, Object> row : rows) {
                    Object val = eval(ctx.expr(0), row);
                    if (val == null) continue;
                    double v = ((Number) val).doubleValue();
                    if (max == null || v > max) max = v;
                }
                return max;
            }
        }

        throw new RuntimeException("Unknown aggregate: " + func);
    }
}