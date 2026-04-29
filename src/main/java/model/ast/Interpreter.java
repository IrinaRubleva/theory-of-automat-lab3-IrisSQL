package model.ast;

import parser.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;


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
}