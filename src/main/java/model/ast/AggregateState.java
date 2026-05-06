package model.ast;

public class AggregateState {

    public Double sum = 0.0;
    public int count = 0;
    public Double min = null;
    public Double max = null;

    public void add(Object val) {

        if (val == null) return;

        double v = ((Number) val).doubleValue();

        sum += v;
        count++;

        if (min == null || v < min) min = v;
        if (max == null || v > max) max = v;
    }
}