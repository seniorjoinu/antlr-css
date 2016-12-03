package core;

import core.gen.varBaseVisitor;
import core.gen.varParser;

public class VarVisitor extends varBaseVisitor<Variable> {
    private VirtualMachine vMachine;

    public VarVisitor() {
        super();
        vMachine = new VirtualMachine();
    }

    @Override
    public Variable visitAddsub(varParser.AddsubContext ctx) {
        Variable var1 = visit(ctx.expression(0));
        Variable var2 = visit(ctx.expression(1));
        if (ctx.op.getText().equals("+")) {
            switch (vMachine.checkTypeSimilarity(var1, var2)) {
                case NUMBER:
                    return new Variable(VarType.NUMBER, (Double)var1.getData() + (Double)var2.getData());
                case STRING:
                    return new Variable(VarType.STRING, var1.toString() + var2.toString());
                case NUMBERUNIT:
                    if (var1.getData().toString().replaceAll("[0-9.]", "").equals(var2.getData().toString().replaceAll("[0-9].", ""))) {
                        return new Variable(VarType.NUMBERUNIT, Double.parseDouble(var1.toString()) + Double.parseDouble(var2.toString()));
                    } else {
                        return null;
                    }
                default:
                    return null;
            }
        } else {
            switch (vMachine.checkTypeSimilarity(var1, var2)) {
                case NUMBER:
                    return new Variable(VarType.NUMBER, (Double)var1.getData() - (Double)var2.getData());
                case NUMBERUNIT:
                    if (var1.getData().toString().replaceAll("[0-9.]", "").equals(var2.getData().toString().replaceAll("[0-9].", ""))) {
                        return new Variable(VarType.NUMBERUNIT, Double.parseDouble(var1.toString()) - Double.parseDouble(var2.toString()));
                    } else {
                        return null;
                    }
                default:
                    return null;
            }
        }
    }

    @Override
    public Variable visitMultdiv(varParser.MultdivContext ctx) {
        Variable var1 = visit(ctx.expression(0));
        Variable var2 = visit(ctx.expression(1));
        if (ctx.op.getText().equals("*")) {
            switch (vMachine.checkTypeSimilarity(var1, var2)) {
                case NUMBER:
                    return new Variable(VarType.NUMBER, (Double)var1.getData() * (Double)var2.getData());
                case NUMBERUNIT:
                    if (var1.getData().toString().replaceAll("[0-9.]", "").equals(var2.getData().toString().replaceAll("[0-9].", ""))) {
                        return new Variable(VarType.NUMBERUNIT, Double.parseDouble(var1.toString()) * Double.parseDouble(var2.toString()));
                    } else {
                        return null;
                    }
                default:
                    return null;
            }
        } else {
            switch (vMachine.checkTypeSimilarity(var1, var2)) {
                case NUMBER:
                    return new Variable(VarType.NUMBER, (Double)var1.getData() / (Double)var2.getData());
                case NUMBERUNIT:
                    if (var1.getData().toString().replaceAll("[0-9.]", "").equals(var2.getData().toString().replaceAll("[0-9].", ""))) {
                        return new Variable(VarType.NUMBERUNIT, Double.parseDouble(var1.toString()) / Double.parseDouble(var2.toString()));
                    } else {
                        return null;
                    }
                default:
                    return null;
            }
        }
    }

    @Override
    public Variable visitModulo(varParser.ModuloContext ctx) {
        Variable var1 = visit(ctx.expression(0));
        Variable var2 = visit(ctx.expression(1));
        System.out.println(var1);
        System.out.println(var2);
        switch (vMachine.checkTypeSimilarity(var1, var2)) {
            case NUMBER:
                return new Variable(VarType.NUMBER, (Integer)var1.getData() % (Integer) var2.getData());
            default:
                return null;
        }
    }

    @Override
    public Variable visitParensExpr(varParser.ParensExprContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public Variable visitPrint(varParser.PrintContext ctx) {
        System.out.println(visit(ctx.expression()));
        return null;
    }

    @Override
    public Variable visitExprPropValue(varParser.ExprPropValueContext ctx) {
        if (ctx.propValue().string() != null) {
            return new Variable(VarType.STRING, ctx.propValue().getText());
        } else if (ctx.propValue().color() != null) {
            return new Variable(VarType.COLOR, ctx.propValue().getText());
        } else if (ctx.propValue().name() != null) {
            return new Variable(VarType.PROPERTY, ctx.propValue().getText());
        } else if (ctx.propValue().id() != null) {
            return vMachine.getVariable(ctx.propValue().getText());
        } else if (ctx.propValue().numberUnit() != null) {
            return new Variable(VarType.NUMBERUNIT, ctx.propValue().getText());
        } else if (ctx.propValue().number() != null) {
            return new Variable(VarType.NUMBER, Double.parseDouble(ctx.propValue().getText()));
        } else {
            return null;
        }
    }
}
