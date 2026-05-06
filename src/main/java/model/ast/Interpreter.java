package model.ast;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import parser.*;

public class Interpreter {

    private final ASTVisitor visitor = new ASTVisitor();

    public Object execute(String sql) {

        CharStream input = CharStreams.fromString(sql);

        IrisSQLLexer lexer = new IrisSQLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        IrisSQLParser parser = new IrisSQLParser(tokens);

        ParseTree tree = parser.prog();

        return visitor.visit(tree);
    }

    public ASTVisitor getVisitor() {
        return visitor;
    }
}