import model.ast.Interpreter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class DBTest {

    private Interpreter db;

    @BeforeEach
    void setup() {
        db = new Interpreter();

        exec("CREATE DATABASE test;");
        exec("CREATE TABLE users (id INTEGER PRIMARY KEY, name TEXT NOT NULL, age INTEGER);");

        exec("INSERT INTO users VALUE (1, \"Alice\", 20);");
        exec("INSERT INTO users VALUE (2, \"Bob\", 30);");
        exec("INSERT INTO users VALUE (3, \"Charlie\", 25);");
    }


    private Object exec(String sql) {
        return db.execute(sql);
    }



    @Test
    void testSelectAll() {
        Object res = exec("SELECT * FROM users;");
        assertNotNull(res);
        assertTrue(res.toString().contains("Alice"));
    }

    @Test
    void testWhere() {
        Object res = exec("SELECT * FROM users WHERE age > 25;");
        String s = res.toString();

        assertTrue(s.contains("Bob"));
        assertFalse(s.contains("Alice"));
    }

    @Test
    void testOrderBy() {
        Object res = exec("SELECT * FROM users ORDER BY age DESC;");
        String s = res.toString();

        assertTrue(s.indexOf("Bob") < s.indexOf("Alice"));
    }

    @Test
    void testLimitSkip() {
        Object res = exec("SELECT * FROM users ORDER BY age SKIP 1 LIMIT 1;");
        String s = res.toString();

        assertFalse(s.contains("Alice"));
        assertTrue(s.contains("Charlie"));
    }




    @Test
    void testMatches() {
        Object res = exec("SELECT * FROM users WHERE matches(\"A.*\", name);");
        String s = res.toString();

        assertTrue(s.contains("Alice"));
        assertFalse(s.contains("Bob"));
    }





    @Test
    void testDelete() {
        exec("DELETE FROM users WHERE id = 2;");
        Object res = exec("SELECT * FROM users;");
        String s = res.toString();

        assertFalse(s.contains("Bob"));
    }





    @Test
    void testAlterAddColumn() {
        exec("ALTER TABLE users ADD COLUMN salary REAL;");
        Object res = exec("SELECT * FROM users;");
        assertNotNull(res);
    }




    @Test
    void testPrimaryKeyViolation() {
        assertThrows(RuntimeException.class, () ->
                exec("INSERT INTO users VALUE (1, \"X\", 99);")
        );
    }

    @Test
    void testNotNullViolation() {
        assertThrows(RuntimeException.class, () ->
                exec("INSERT INTO users VALUE (10, NULL, 10);")
        );
    }





    @Test
    void testGroupByCount() {
        Object res = exec("SELECT age, count() FROM users GROUP BY age;");
        String s = res.toString();

        assertTrue(s.contains("1")); // count
    }

    @Test
    void testGroupBySum() {
        Object res = exec("SELECT age, sum(age) FROM users GROUP BY age;");
        assertNotNull(res);
    }





    @Test
    void testIndexedTable() {
        exec("CREATE TABLE idx (id INTEGER PRIMARY KEY, value TEXT);");

        exec("INSERT INTO idx VALUE (1, \"A\");");
        exec("INSERT INTO idx VALUE (2, \"B\");");

        Object res = exec("SELECT * FROM idx WHERE id = 1;");
        String s = res.toString();

        assertTrue(s.contains("A"));
    }

    @Test
    void testIndexWithoutPKFails() {
        assertThrows(RuntimeException.class, () ->
                exec("CREATE TABLE bad (id INTEGER) WITH INDEXING BY HASH;")
        );
    }






    @Test
    void testJoin() {

        exec("CREATE TABLE orders (id INTEGER PRIMARY KEY, user_id INTEGER);");

        exec("INSERT INTO orders VALUE (1, 1);");
        exec("INSERT INTO orders VALUE (2, 3);");

        Object res = exec("SELECT * FROM users JOIN orders ON id = user_id;");
        String s = res.toString();

        assertTrue(s.contains("Alice"));
        assertTrue(s.contains("Charlie"));
    }



    @Test
    void testSubqueryInFrom() {

        Interpreter sql = new Interpreter();
        exec("CREATE DATABASE subquery_test;");
        exec("CREATE TABLE users (id INTEGER, name TEXT);");

        exec("INSERT INTO users VALUE (1, \"Alice\");");
        exec("INSERT INTO users VALUE (2, \"Bob\");");

        Object result = exec("SELECT id FROM (SELECT * FROM users);");

        List<Map<String, Object>> rows = (List<Map<String, Object>>) result;

        assertEquals(2, rows.size());
    }


    @Test
    void testBikeCost() {

        exec("CREATE TABLE components (id INTEGER PRIMARY KEY, name TEXT, price REAL);");
        exec("CREATE TABLE bike_components (bike_id INTEGER, component_id INTEGER, qty INTEGER);");

        exec("INSERT INTO components VALUE (1, \"wheel\", 100);");
        exec("INSERT INTO components VALUE (2, \"frame\", 300);");

        exec("INSERT INTO bike_components VALUE (1, 1, 2);");
        exec("INSERT INTO bike_components VALUE (1, 2, 1);");

        Object res = exec("""
            SELECT bike_id, sum(price * qty)
            FROM bike_components
            JOIN components ON component_id = id
            GROUP BY bike_id;
        """);

        String s = res.toString();

        assertTrue(s.contains("500")); // 2*100 + 300
    }
}