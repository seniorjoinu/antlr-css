package core.syntax;

import core.controller.IdeController;
import core.gen.csssBaseVisitor;
import core.gen.csssParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.fxmisc.richtext.StyleClassedTextArea;

public class Highlighter extends csssBaseVisitor<String> {
    private IdeController controller;

    public Highlighter(IdeController controller) {
        this.controller = controller;
    }

    private void styleError(ParserRuleContext ctx) {
        if (ctx.exception != null) {
            controller.codeTextArea.setStyleClass(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex() + 1, "error");
        }
    }

    @Override
    public String visitProgram(csssParser.ProgramContext ctx) {
        controller.codeTextArea.setStyleClass(0, controller.codeTextArea.getText().length(), "default");
        return super.visitProgram(ctx);
    }

    @Override
    public String visitBool(csssParser.BoolContext ctx) {
        controller.codeTextArea.setStyleClass(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex() + 1, "purple");
        return super.visitBool(ctx);
    }

    @Override
    public String visitForDefinition(csssParser.ForDefinitionContext ctx) {
        styleError(ctx);
        controller.codeTextArea.setStyleClass(ctx.For().getSymbol().getStartIndex(), ctx.For().getSymbol().getStopIndex() + 1, "purple");
        controller.codeTextArea.setStyleClass(ctx.From().getSymbol().getStartIndex(), ctx.From().getSymbol().getStopIndex() + 1, "purple");
        controller.codeTextArea.setStyleClass(ctx.To().getSymbol().getStartIndex(), ctx.To().getSymbol().getStopIndex() + 1, "purple");

        return super.visitForDefinition(ctx);
    }

    @Override
    public String visitIfDefinition(csssParser.IfDefinitionContext ctx) {
        styleError(ctx);
        controller.codeTextArea.setStyleClass(ctx.If().getSymbol().getStartIndex(), ctx.If().getSymbol().getStopIndex() + 1, "purple");
        controller.codeTextArea.setStyleClass(ctx.Else().getSymbol().getStartIndex(), ctx.Else().getSymbol().getStopIndex() + 1, "purple");
        return super.visitIfDefinition(ctx);
    }

    @Override
    public String visitVarDefinition(csssParser.VarDefinitionContext ctx) {
        styleError(ctx);
        return super.visitVarDefinition(ctx);
    }

    @Override
    public String visitClassDefinition(csssParser.ClassDefinitionContext ctx) {
        styleError(ctx);
        return super.visitClassDefinition(ctx);
    }

    @Override
    public String visitSelector(csssParser.SelectorContext ctx) {
        controller.codeTextArea.setStyleClass(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex() + 1, "blue bold");
        return super.visitSelector(ctx);
    }

    @Override
    public String visitPropName(csssParser.PropNameContext ctx) {
        controller.codeTextArea.setStyleClass(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex() + 1, "bold");
        return super.visitPropName(ctx);
    }

    @Override
    public String visitId(csssParser.IdContext ctx) {
        controller.codeTextArea.setStyleClass(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex() + 1, "blue");
        return super.visitId(ctx);
    }
}
