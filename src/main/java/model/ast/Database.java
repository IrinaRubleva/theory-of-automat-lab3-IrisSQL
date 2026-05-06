package model.ast;

import java.util.*;

public class Database {

    public final String name;
    private final Map<String, Table> tables = new HashMap<>();

    public Database(String name) {
        this.name = name;
    }

    public void createTable(Table table) {
        if (tables.containsKey(table.name)) {
            throw new RuntimeException("Table exists: " + table.name);
        }
        tables.put(table.name, table);
    }

    public void dropTable(String name) {
        tables.remove(name);
    }

    public Table getTable(String name) {
        Table t = tables.get(name);
        if (t == null) throw new RuntimeException("Table not found: " + name);
        return t;
    }

    public String getName() { return name; }

}