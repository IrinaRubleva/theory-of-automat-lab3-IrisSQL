package controller;

import parser.*;
import model.ast.Interpreter;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/{db}")
public class Controller {

    private final Interpreter interpreter = new Interpreter();

    @PostMapping
    public Object execute(@RequestBody String sql, @PathVariable String db) {

        System.out.println("DB: " + db);
        System.out.println("SQL: " + sql);

        return interpreter.execute(sql);
    }
}