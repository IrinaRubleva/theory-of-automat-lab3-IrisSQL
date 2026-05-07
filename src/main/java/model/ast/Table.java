package model.ast;

import java.util.*;

public class Table {

    public final String name;
    public final List<Column> columns;
    public final List<Map<String, Object>> rows = new ArrayList<>();

    public final Map<String, Constraint> constraints = new LinkedHashMap<>();

    public final IndexType indexType;
    private Column primaryKey;


    private Map<Object, Map<String, Object>> hashIndex;
    private TreeMap<Object, Map<String, Object>> treeIndex;
    private List<Map<String, Object>> orderedIndex;

    public Table(String name, List<Column> columns, IndexType indexType) {

        this.name = name;
        this.columns = columns;
        this.indexType = indexType;

        initPrimaryKey();
        initIndex();
        validateIndex();
    }


    private void initPrimaryKey() {
        this.primaryKey = columns.stream()
                .filter(c -> c.primaryKey)
                .findFirst()
                .orElse(null);
    }

    private void initIndex() {

        switch (indexType) {
            case HASH:
                hashIndex = new HashMap<>();
                break;
            case TREE:
                treeIndex = new TreeMap<>();
                break;
            case ORDER:
                orderedIndex = new ArrayList<>();
                break;
            case NONE:
                break;
        }
    }

    private void validateIndex() {
        if (indexType != IndexType.NONE && primaryKey == null) {
            throw new RuntimeException("Indexed table requires PRIMARY KEY");
        }
    }



    public void insert(List<Object> values) {
        if (values.size() != columns.size()) {
            throw new RuntimeException("Column count mismatch");
        }
        Map<String, Object> row = new HashMap<>();
        for (int i = 0; i < columns.size(); i++) {
            Column col = columns.get(i);
            Object val = values.get(i);
            if (col.notNull && val == null) {
                throw new RuntimeException("NOT NULL violated: " + col.name);
            }
            validateType(col, val);
            row.put(col.name, val);
        }
        for (Constraint constraint : constraints.values()) {

            switch (constraint.type) {
                case UNIQUE:
                    checkUniqueConstraint(constraint, row);
                    break;

                case PRIMARY_KEY:
                    checkPrimaryKeyConstraint(constraint, row);
                    break;
            }
        }

        rows.add(row);
        addToIndex(row);
    }

    // Проверка UNIQUE constraint
    private void checkUniqueConstraint(Constraint constraint, Map<String, Object> row) {
        for (Map<String, Object> existingRow : rows) {
            boolean allColumnsMatch = true;

            for (String columnName : constraint.columns) {
                Object existingValue = existingRow.get(columnName);
                Object newValue = row.get(columnName);

                if (!Objects.equals(existingValue, newValue)) {
                    allColumnsMatch = false;
                    break;
                }
            }

            if (allColumnsMatch) {
                throw new RuntimeException(
                        String.format("UNIQUE constraint violated: %s on columns %s",
                                constraint.name,
                                constraint.columns)
                );
            }
        }
    }

    // Проверка PRIMARY KEY constraint
    private void checkPrimaryKeyConstraint(Constraint constraint, Map<String, Object> row) {
        for (String columnName : constraint.columns) {
            if (row.get(columnName) == null) {
                throw new RuntimeException(
                        String.format("PRIMARY KEY constraint violated: %s cannot be NULL in column %s",
                                constraint.name,
                                columnName)
                );
            }
        }
        for (Map<String, Object> existingRow : rows) {
            boolean allColumnsMatch = true;
            for (String columnName : constraint.columns) {
                Object existingValue = existingRow.get(columnName);
                Object newValue = row.get(columnName);
                if (!Objects.equals(existingValue, newValue)) {
                    allColumnsMatch = false;
                    break;
                }
            }
            if (allColumnsMatch) {
                throw new RuntimeException(
                        String.format("PRIMARY KEY constraint violated: %s duplicate key on columns %s",
                                constraint.name,
                                constraint.columns)
                );
            }
        }
    }

    private void addToIndex(Map<String, Object> row) {

        if (indexType == IndexType.NONE) return;

        Object key = row.get(primaryKey.name);

        switch (indexType) {

            case HASH:
                hashIndex.put(key, row);
                break;

            case TREE:
                treeIndex.put((Comparable) key, row);
                break;

            case ORDER:
                orderedIndex.add(row);
                orderedIndex.sort(Comparator.comparing(r -> (Comparable) r.get(primaryKey.name)));
                break;
        }
    }

    //SEARCH BY PK
    public Map<String, Object> findByPrimaryKey(Object key) {

        if (primaryKey == null) {
            throw new RuntimeException("No PRIMARY KEY");
        }

        switch (indexType) {

            case HASH:
                return hashIndex.get(key);

            case TREE:
                return treeIndex.get(key);

            case ORDER:
                return binarySearch(key);

            default:
                // fallback O(n)
                for (Map<String, Object> row : rows) {
                    if (Objects.equals(row.get(primaryKey.name), key)) {
                        return row;
                    }
                }
                return null;
        }
    }

    //BINARY SEARCH для ORDER
    private Map<String, Object> binarySearch(Object key) {

        int left = 0;
        int right = orderedIndex.size() - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            Comparable midVal = (Comparable) orderedIndex.get(mid).get(primaryKey.name);
            int cmp = midVal.compareTo(key);

            if (cmp == 0) {
                return orderedIndex.get(mid);
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }


    public void addColumn(Column col) {
        columns.add(col);
        for (Map<String, Object> row : rows) {
            row.put(col.name, null);
        }
    }

    public void dropColumn(String name) {
        String normalized = name.trim();
        boolean removed = columns.removeIf(c -> c.name.equalsIgnoreCase(normalized));
        if (!removed) {
            throw new RuntimeException("Column not found: " + name);
        }
        for (Map<String, Object> row : rows) {
            row.remove(normalized);
        }
        constraints.values().removeIf(c -> c.columns.contains(normalized));

        System.out.println("Trying to drop column: '" + name + "'");
        System.out.println("Existing columns: " + columns.stream().map(c -> c.name).toList());
    }

    public void editColumn(Column newCol) {
        Column old = columns.stream().filter(c -> c.name.equals(newCol.name))
                .findFirst().orElseThrow(() ->
                        new RuntimeException("Column not found: " + newCol.name)
                );

        columns.remove(old);
        columns.add(newCol);

        for (Map<String, Object> row : rows) {
            Object val = row.get(newCol.name);
            if (newCol.notNull && val == null) {
                throw new RuntimeException("NOT NULL violated for existing data: " + newCol.name);
            }
            if (val != null) {
                validateType(newCol, val);
            }
        }
    }

    private void validateType(Column col, Object val) {
        if (val == null) return;
        switch (col.type) {
            case INTEGER:
                if (!(val instanceof Integer)) {
                    throw new RuntimeException("Expected INTEGER for column " + col.name);
                }
                break;
            case REAL:
                if (!(val instanceof Double) && !(val instanceof Integer)) {
                    throw new RuntimeException("Expected REAL for column " + col.name);
                }
                break;
            case TEXT:
                if (!(val instanceof String)) {
                    throw new RuntimeException("Expected TEXT for column " + col.name);
                }
                break;
            case LOGIC:
                if (!(val instanceof Boolean)) {
                    throw new RuntimeException("Expected LOGIC for column " + col.name);
                }
                break;
        }
    }


    public void addConstraint(Constraint c) {
        if (constraints.containsKey(c.name)) {
            throw new RuntimeException("Constraint already exists: " + c.name );
        }
        if (c.type == ConstraintType.PRIMARY_KEY) {
            boolean alreadyExists =
                    constraints.values().stream()
                            .anyMatch(x -> x.type == ConstraintType.PRIMARY_KEY);
            if (alreadyExists) {
                throw new RuntimeException("PRIMARY KEY already exists");
            }
        }
        constraints.put(c.name, c);
    }
    public void dropConstraint(String name) {
        if (!constraints.containsKey(name)) {
            throw new RuntimeException("Constraint not found: " + name);
        }
        constraints.remove(name);
    }
}