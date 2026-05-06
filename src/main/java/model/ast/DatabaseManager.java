package model.ast;

import java.util.*;

public class DatabaseManager {

    private final Map<String, Database> databases = new HashMap<>();

    public void createDatabase(String name) {
        if (databases.containsKey(name)) {
            throw new RuntimeException("Database exists: " + name);
        }
        databases.put(name, new Database(name));
    }

    public void dropDatabase(String name) {
        databases.remove(name);
    }

    public Database getDatabase(String name) {
        Database db = databases.get(name);
        if (db == null) {
            throw new RuntimeException("Database not found: " + name);
        }
        return db;
    }
}