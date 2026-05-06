package model.ast;

public class Column {

    public final String name;
    public final DataType type;

    public boolean notNull = false;
    public boolean unique = false;
    public boolean primaryKey = false;

    public Column(String name, DataType type) {
        this.name = name;
        this.type = type;
    }
}