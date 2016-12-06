package core.syntax;

import core.gen.csssBaseVisitor;
import core.gen.csssParser;

public class Highlighter extends csssBaseVisitor<String> {
    public Highlighter() {
    }

    @Override
    public String visitBool(csssParser.BoolContext ctx) {
        return super.visitBool(ctx);
    }
}
