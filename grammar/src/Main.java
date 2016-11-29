import core.Visitor;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import parse.cssLexer;
import parse.cssParser;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        cssLexer lexer = new cssLexer(new ANTLRFileStream(Main.class.getClassLoader().getResource("test.css").getFile()));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        cssParser parser = new cssParser(tokens);
        ParseTree tree = parser.program();

        Visitor visitor = new Visitor(() -> {});
        visitor.visit(tree);
    }
}
