package model.ast;

import java.util.*;



public class Database {

    private final Map<String, Table> tables = new HashMap<>();

    public void createTable(String name, List<String> columns) {
        if (tables.containsKey(name)) {
            throw new RuntimeException("Table already exists: " + name);
        }
        tables.put(name, new Table(name, columns));
    }

    public Table getTable(String name) {
        Table t = tables.get(name);
        if (t == null) {
            throw new RuntimeException("Table not found: " + name);
        }
        return t;
    }

    public List<Map<String, Object>> selectAll(String tableName) {
        return new ArrayList<>(getTable(tableName).rows);
    }
}