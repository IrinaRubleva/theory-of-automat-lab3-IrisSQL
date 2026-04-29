package model.ast;

import java.util.*;

public class Table {

    public final String name;
    public final List<String> columns;
    public final List<Map<String, Object>> rows = new ArrayList<>();

    public Table(String name, List<String> columns) {
        this.name = name;
        this.columns = columns;
    }

    public void insert(List<Object> values) {

        if (values.size() != columns.size()) {
            throw new RuntimeException("Column count mismatch");
        }

        Map<String, Object> row = new LinkedHashMap<>();

        for (int i = 0; i < columns.size(); i++) {
            row.put(columns.get(i), values.get(i));
        }

        rows.add(row);
    }
}