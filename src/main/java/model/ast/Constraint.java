package model.ast;

import java.util.List;

public class Constraint {

    public String name;

    public ConstraintType type;

    public List<String> columns;

    public Constraint(String name,
                      ConstraintType type,
                      List<String> columns) {

        this.name = name;
        this.type = type;
        this.columns = columns;
    }
}