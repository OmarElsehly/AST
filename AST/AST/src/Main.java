import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String input = "a = 3 + 4\nb = a * 2\n";

        ExprLexer lexer = new ExprLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(tokens);

        ParseTree tree = parser.prog();  // Start rule
        System.out.println(tree.toStringTree(parser)); // AST as string

        ParseTreeWalker walker = new ParseTreeWalker();
        ASTPrinter listener = new ASTPrinter();
        walker.walk(listener, tree);
    }
}
