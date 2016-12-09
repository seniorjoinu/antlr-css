package core.syntax;

import core.controller.IdeController;
import core.gen.csssBaseVisitor;
import core.gen.csssParser;

public class Highlighter extends csssBaseVisitor<String> {
    private IdeController controller;

    public Highlighter(IdeController controller) {
        this.controller = controller;
    }

    @Override
    public String visitProgram(csssParser.ProgramContext ctx) {
        controller.codeTextArea.setStyleClass(0, controller.codeTextArea.getText().length(), "default");
        ctx.member().forEach(this::visit);
        return super.visitProgram(ctx);
    }

    @Override
    public String visitBool(csssParser.BoolContext ctx) {
        controller.codeTextArea.setStyleClass(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex() + 1, "purple");
        return super.visitBool(ctx);
    }

    @Override
    public String visitForDefinition(csssParser.ForDefinitionContext ctx) {
        controller.codeTextArea.setStyleClass(ctx.For().getSymbol().getStartIndex(), ctx.For().getSymbol().getStopIndex() + 1, "purple");
        controller.codeTextArea.setStyleClass(ctx.From().getSymbol().getStartIndex(), ctx.From().getSymbol().getStopIndex() + 1, "purple");
        controller.codeTextArea.setStyleClass(ctx.To().getSymbol().getStartIndex(), ctx.To().getSymbol().getStopIndex() + 1, "purple");
        ctx.member().forEach(this::visit);
        return super.visitForDefinition(ctx);
    }

    @Override
    public String visitIfDefinition(csssParser.IfDefinitionContext ctx) {
        controller.codeTextArea.setStyleClass(ctx.If().getSymbol().getStartIndex(), ctx.If().getSymbol().getStopIndex() + 1, "purple");
        ctx.trueMember().forEach(this::visit);
        if (ctx.falseMember(0) != null) {
            controller.codeTextArea.setStyleClass(ctx.Else().getSymbol().getStartIndex(), ctx.Else().getSymbol().getStopIndex() + 1, "purple");
            ctx.falseMember().forEach(this::visit);
        }
        return super.visitIfDefinition(ctx);
    }

    @Override
    public String visitVarDefinition(csssParser.VarDefinitionContext ctx) {
        controller.codeTextArea.setStyleClass(ctx.id().getStart().getStartIndex(), ctx.id().getStop().getStopIndex() + 1, "blue");
        visit(ctx.expression());
        return super.visitVarDefinition(ctx);
    }

    @Override
    public String visitClassDefinition(csssParser.ClassDefinitionContext ctx) {
        controller.codeTextArea.setStyleClass(ctx.selector().getStart().getStartIndex(), ctx.selector().getStop().getStopIndex() + 1, "blue-bold");
        visit(ctx.classBody());
        return super.visitClassDefinition(ctx);
    }

    @Override
    public String visitClassBody(csssParser.ClassBodyContext ctx) {
        ctx.definition().forEach(this::visit);
        ctx.property().forEach(this::visit);
        return super.visitClassBody(ctx);
    }

    @Override
    public String visitProperty(csssParser.PropertyContext ctx) {
        controller.codeTextArea.setStyleClass(ctx.propName().getStart().getStartIndex(), ctx.propName().getStop().getStopIndex() + 1, "bold");
        return super.visitProperty(ctx);
    }
}
