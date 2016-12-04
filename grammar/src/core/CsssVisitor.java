package core;

import core.gen.csssBaseVisitor;
import core.gen.csssParser;

import java.io.IOException;

public class CsssVisitor extends csssBaseVisitor<Variable> {
    private VirtualMachine vMachine;

    public CsssVisitor() {
        super();
        vMachine = new VirtualMachine();
    }

    // печать на экран
    @Override
    public Variable visitPrint(csssParser.PrintContext ctx) {
        System.out.println(visit(ctx.expression()).getData().toString());
        return null;
    }

    // эвалюатор
    @Override
    public Variable visitExprPropValue(csssParser.ExprPropValueContext ctx) {
        if (ctx.propValue().string() != null) {
            return new Variable(VarType.STRING, ctx.propValue().getText().substring(1, ctx.propValue().getText().length()-1));
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
        } else if (ctx.propValue().bool() != null) {
            return new Variable(VarType.BOOLEAN, ctx.propValue().getText());
        } else {
            return null;
        }
    }

    // определение переменной
    @Override
    public Variable visitVarDefinition(csssParser.VarDefinitionContext ctx) {
        Variable result = visit(ctx.expression());
        vMachine.storeVariable(ctx.id().getText(), result);
        return result;
    }

    // определение условного оператора
    @Override
    public Variable visitIfDefinition(csssParser.IfDefinitionContext ctx) {
        if (visit(ctx.predicate()).getData().equals("true")) {
            return visit(ctx.trueMembers);
        } else {
            return visit(ctx.falseMembers);
        }
    }

    // определение тела цикла
    @Override
    public Variable visitForDefinition(csssParser.ForDefinitionContext ctx) {
        Long start = (new Variable(VarType.NUMBER, ctx.startCount.getText())).doubleValue().longValue();
        Long end = (new Variable(VarType.NUMBER, ctx.endCount.getText())).doubleValue().longValue();

        vMachine.storeVariable(ctx.id().getText(), new Variable(VarType.NUMBER, start));
        for (long i = start; i <= end; i++) {
            visit(ctx.forBody);
            vMachine.getVariable(ctx.id().getText()).setData(i+1);
        }
        vMachine.unstoreVariable(ctx.id().getText());

        return null;
    }

    /* Что касается арифметики */
    // +-
    @Override
    public Variable visitAddsub(csssParser.AddsubContext ctx) {
        Variable var1 = visit(ctx.expression().get(0));
        Variable var2 = visit(ctx.expression().get(1));
        if (ctx.op.getText().equals("+")) {
            if (var1.getType() == VarType.STRING || var2.getType() == VarType.STRING) {
                return new Variable(VarType.STRING, var1.getData().toString() + var2.getData().toString());
            }
            switch (vMachine.checkTypeSimilarity(var1, var2)) {
                case NUMBER:
                    return new Variable(VarType.NUMBER, var1.doubleValue() + var2.doubleValue());
                case STRING:
                    return new Variable(VarType.STRING, var1.getData().toString() + var2.getData().toString());
                case NUMBERUNIT:
                    String unit1 = var1.getData().toString().replaceAll("[0-9.]", ""),
                            unit2 = var2.getData().toString().replaceAll("[0-9.]", "");
                    if (unit1.equals(unit2)) {
                        return new Variable(VarType.NUMBERUNIT, (var1.doubleValue() + var2.doubleValue()) + unit1);
                    } else {
                        return null;
                    }
                default:
                    return null;
            }
        } else {
            switch (vMachine.checkTypeSimilarity(var1, var2)) {
                case NUMBER:
                    return new Variable(VarType.NUMBER, var1.doubleValue() - var2.doubleValue());
                case NUMBERUNIT:
                    String unit1 = var1.getData().toString().replaceAll("[0-9.]", ""),
                            unit2 = var2.getData().toString().replaceAll("[0-9.]", "");
                    if (unit1.equals(unit2)) {
                        return new Variable(VarType.NUMBERUNIT, (var1.doubleValue() - var2.doubleValue()) + unit1);
                    } else {
                        return null;
                    }
                default:
                    return null;
            }
        }
    }
    // */
    @Override
    public Variable visitMultdiv(csssParser.MultdivContext ctx) {
        Variable var1 = visit(ctx.expression(0));
        Variable var2 = visit(ctx.expression(1));
        if (ctx.op.getText().equals("*")) {
            switch (vMachine.checkTypeSimilarity(var1, var2)) {
                case NUMBER:
                    return new Variable(VarType.NUMBER, var1.doubleValue() * var2.doubleValue());
                case NUMBERUNIT:
                    String unit1 = var1.getData().toString().replaceAll("[0-9.]", ""),
                            unit2 = var2.getData().toString().replaceAll("[0-9.]", "");
                    if (unit1.equals(unit2)) {
                        return new Variable(VarType.NUMBERUNIT, (var1.doubleValue() * var2.doubleValue()) + unit1);
                    } else {
                        return null;
                    }
                default:
                    return null;
            }
        } else {
            switch (vMachine.checkTypeSimilarity(var1, var2)) {
                case NUMBER:
                    return new Variable(VarType.NUMBER, var1.doubleValue() / var2.doubleValue());
                case NUMBERUNIT:
                    String unit1 = var1.getData().toString().replaceAll("[0-9.]", ""),
                            unit2 = var2.getData().toString().replaceAll("[0-9.]", "");
                    if (unit1.equals(unit2)) {
                        return new Variable(VarType.NUMBERUNIT, (var1.doubleValue() / var2.doubleValue()) + unit1);
                    } else {
                        return null;
                    }
                default:
                    return null;
            }
        }
    }
    // %
    @Override
    public Variable visitModulo(csssParser.ModuloContext ctx) {
        Variable var1 = visit(ctx.expression(0));
        Variable var2 = visit(ctx.expression(1));
        switch (vMachine.checkTypeSimilarity(var1, var2)) {
            case NUMBER:
                return new Variable(VarType.NUMBER, (Long)var1.getData() % (Long) var2.getData());
            default:
                return null;
        }
    }

    // ()
    @Override
    public Variable visitParensExpr(csssParser.ParensExprContext ctx) {
        return visit(ctx.expression());
    }


    /* Что касается предикатов */
    // ==
    @Override
    public Variable visitEq(csssParser.EqContext ctx) {
        Variable var1 = visit(ctx.predicate(0));
        Variable var2 = visit(ctx.predicate(1));

        if (var1.equals(var2)) {
            return new Variable(VarType.BOOLEAN, "true");
        } else {
            return new Variable(VarType.BOOLEAN, "false");
        }
    }

    // TODO: сделать остальные логические операции


    @Override
    public Variable visitExprPred(csssParser.ExprPredContext ctx) {
        return visit(ctx.expression());
    }


    /* Что касается классов */

    @Override
    public Variable visitSelector(csssParser.SelectorContext ctx) {
        if (ctx.op != null) {
            vMachine.startClass(ctx.op.getText() + " " + ctx.getText().substring(1));
        } else {
            vMachine.startClass(ctx.getText());
        }
        return null;
    }

    @Override
    public Variable visitClassBody(csssParser.ClassBodyContext ctx) {
        CssProperty property;
        for (csssParser.PropertyContext pctx: ctx.property()) {
            property = new CssProperty(pctx.propName().getText());
            for (csssParser.ExpressionContext ectx: pctx.expression()) {
                property.addValue(visit(ectx));
            }
            vMachine.addProperty(property);
        }

        //TODO: тут можно задать отдельную логику для выражений
        ctx.definition().stream().filter(dctx -> dctx.classDefinition() != null).forEach(dctx -> {
            visit(dctx.classDefinition());
        });
        vMachine.endClass();

        return null;
    }

    public void dump(String filename) {
        try {
            vMachine.dumpClasses(filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
