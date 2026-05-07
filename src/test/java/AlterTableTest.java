import model.ast.Interpreter;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

public class AlterTableTest {
    private Interpreter db = new Interpreter();

    private Object exec(String sql) {
        return db.execute(sql);
    }

    @Test
    void testEditColumn() {
        exec("CREATE DATABASE db_edit;");
        exec("""
            CREATE TABLE users (
                id INTEGER,
                name TEXT
            );
        """);
        exec("""
            ALTER TABLE users
            EDIT COLUMN name INTEGER NOT NULL;
        """);
        exec("INSERT INTO users VALUE (1, 100);");
        assertThrows(RuntimeException.class, () -> exec("INSERT INTO users VALUE (2, \"Alice\");"));
        assertThrows(RuntimeException.class, () -> exec("INSERT INTO users VALUE (3, NULL);"));
        exec("DROP DATABASE db_edit;");
    }

    @Test
    void testDropColumn() {
        exec("CREATE DATABASE db_drop_col;");
        exec("CREATE TABLE users (id INTEGER, name TEXT);");
        exec("INSERT INTO users VALUE (1, \"Alice\");");
        exec("ALTER TABLE users DROP COLUMN name;");
        exec("INSERT INTO users VALUE (2);");   // теперь только id
        assertThrows(RuntimeException.class, () -> exec("INSERT INTO users VALUE (3, \"Bob\");"));
        List<Map<String, Object>> rows = (List<Map<String, Object>>) exec("SELECT * FROM users;");
        assertEquals(2, rows.size());
        assertTrue(rows.get(0).containsKey("id"));
        assertFalse(rows.get(0).containsKey("name"));
        exec("DROP DATABASE db_drop_col;");
    }

    @Test
    void testDropConstraint() {
        exec("CREATE DATABASE db_drop_con;");
        exec("""
            CREATE TABLE users (
                id INTEGER,
                name TEXT
            );
        """);
        exec("ALTER TABLE users ADD CONSTRAINT uq_name UNIQUE(name);");
        exec("INSERT INTO users VALUE (1, \"Alice\");");
        assertThrows(RuntimeException.class, () -> exec("INSERT INTO users VALUE (2, \"Alice\");"));
        exec("ALTER TABLE users DROP CONSTRAINT uq_name;");
        exec("INSERT INTO users VALUE (2, \"Alice\");");
        List<Map<String, Object>> rows = (List<Map<String, Object>>) exec("SELECT * FROM users;");
        assertEquals(2, rows.size());
        exec("DROP DATABASE db_drop_con;");
    }
}