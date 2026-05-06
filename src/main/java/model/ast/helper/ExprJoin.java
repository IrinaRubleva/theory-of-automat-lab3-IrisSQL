package model.ast.helper;

import parser.IrisSQLParser;
import model.ast.ASTVisitor;
import java.util.*;

public class ExprJoin {
    private final ExprEvaluator eval;
    private final ASTVisitor visitor;

    public ExprJoin(ExprEvaluator eval, ASTVisitor visitor) {
        this.eval = eval;
        this.visitor = visitor;
    }


    public JoinType getJoinType(IrisSQLParser.JoinClauseContext ctx) {
        if (ctx.LEFT() != null) return JoinType.LEFT;
        if (ctx.RIGHT() != null) return JoinType.RIGHT;
        if (ctx.FULL() != null) return JoinType.FULL;
        return JoinType.INNER;
    }

    public enum JoinType {
        INNER, LEFT, RIGHT, FULL
    }

    public List<Map<String, Object>> applyJoin(
            List<Map<String, Object>> left,
            List<Map<String, Object>> right,
            IrisSQLParser.ExprContext condition,
            JoinType type) {

        List<Map<String, Object>> result = new ArrayList<>();
        Set<Map<String, Object>> matchedRight = new HashSet<>();
        Set<Map<String, Object>> matchedLeft = new HashSet<>(); // для FULL/RIGHT

        //INNER
        for (Map<String, Object> l : left) {
            boolean matched = false;
            for (Map<String, Object> r : right) {
                Map<String, Object> merged = visitor.mergeRows(l, r, "right");
                Object condVal = eval.eval(condition, merged);
                if (eval.toBoolean(condVal)) {
                    matched = true;
                    matchedRight.add(r);
                    matchedLeft.add(l);
                    result.add(merged);
                }
            }
            if (!matched && (type == JoinType.LEFT || type == JoinType.FULL)) {
                result.add(visitor.mergeRows(l, visitor.emptyRow(right), "right"));
            }
        }
        // RIGHT и FULL
        if (type == JoinType.RIGHT || type == JoinType.FULL) {
            for (Map<String, Object> r : right) {
                if (!matchedRight.contains(r)) {
                    result.add(visitor.mergeRows(visitor.emptyRow(left), r, "right"));
                }
            }
        }
        return result;
    }
}
