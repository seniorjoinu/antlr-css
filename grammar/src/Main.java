import core.VarVisitor;
import core.gen.varLexer;
import core.gen.varParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        varLexer lexer = new varLexer(new ANTLRFileStream(Main.class.getClassLoader().getResource("test.csss").getFile()));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        varParser parser = new varParser(tokens);
        ParseTree tree = parser.program();

        VarVisitor visitor = new VarVisitor();
        visitor.visit(tree);
    }
}
