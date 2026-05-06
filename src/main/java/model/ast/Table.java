package model.ast;

import java.util.*;

public class Table {

    public final String name;
    public final List<Column> columns;
    public final List<Map<String, Object>> rows = new ArrayList<>();

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

            // UNIQUE / PK
            if (col.unique || col.primaryKey) {
                for (Map<String, Object> r : rows) {
                    if (Objects.equals(r.get(col.name), val)) {
                        throw new RuntimeException("UNIQUE violated: " + col.name);
                    }
                }
            }

            row.put(col.name, val);
        }

        rows.add(row);
        addToIndex(row);
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

    //ALTER SUPPORT
    public void addColumn(Column col) {
        columns.add(col);
        for (Map<String, Object> row : rows) {
            row.put(col.name, null);
        }
    }

    public void dropColumn(String name) {
        columns.removeIf(c -> c.name.equals(name));
        for (Map<String, Object> row : rows) {
            row.remove(name);
        }
    }

    public void editColumn(Column newCol) {
        dropColumn(newCol.name);
        addColumn(newCol);
    }
}