import core.CsssVisitor;
import core.gen.csssLexer;
import core.gen.csssParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        csssLexer lexer = new csssLexer(new ANTLRFileStream(Main.class.getClassLoader().getResource("test.csss").getFile()));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        csssParser parser = new csssParser(tokens);
        ParseTree tree = parser.program();

        CsssVisitor visitor = new CsssVisitor();
        visitor.visit(tree);
        visitor.dump("test.css");
    }
}
