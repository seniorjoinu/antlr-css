package core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTree;
import parse.Event;
import parse.cssBaseVisitor;
import parse.cssParser;

public class Visitor extends cssBaseVisitor<Integer> {
    private Map<String, List<Variable>> memory;
    private Map<String, CssClass> classes;
    private String currentSelector;
    private Event onVisitEnd;

    public Visitor(Event onVisitEnd) {
        super();
        this.onVisitEnd = onVisitEnd;
        memory = new HashMap<>();
        classes = new HashMap<>();
    }

    public Integer visit(ParseTree tree) {
        Integer result = super.visit(tree);
        onVisitEnd.fire();
        // TODO: сделать, чтобы работало через событие
        for (Map.Entry<String, CssClass> cls: classes.entrySet()) {
            System.out.println(cls.getValue().toString());
        }
        return result;
    }

    @Override
    public Integer visitVarDefinition(cssParser.VarDefinitionContext ctx) {
        String id = ctx.variable().getText();
        List<Variable> varResult = new ArrayList<>();

        String value;
        VarType type;

        for (cssParser.PropValueContext valueContext: ctx.propValue()) {
            value = null;
            type = null;

            if (valueContext.numberUnit() != null) {
                type = VarType.NUMBERUNIT;
                value = valueContext.numberUnit().getText();
            } else if (valueContext.number() != null) {
                type = VarType.NUMBER;
                value = valueContext.number().getText();
            } else if (valueContext.color() != null) {
                type = VarType.COLOR;
                value = valueContext.color().getText();
            } else if (valueContext.name() != null) {
                type = VarType.PROPERTY;
                value = valueContext.name().getText();
            } else if (valueContext.string() != null) {
                type = VarType.STRING;
                value = valueContext.string().getText();
            }

            if (value != null) {
                varResult.add(new Variable(type, value));
            }
        }

        if (varResult.size() > 0) {
            memory.put(id, varResult);
        }

        return super.visitVarDefinition(ctx);
    }

    @Override
    public Integer visitCssClass(cssParser.CssClassContext ctx) {
        currentSelector = ctx.selector().getText();
        return super.visitCssClass(ctx);
    }

    @Override
    public Integer visitCssBody(cssParser.CssBodyContext ctx) {
        String propName;
        List<Variable> propValue;

        CssClass cssClass = new CssClass(currentSelector);

        // бежим по всем пропертям этого класса
        for (cssParser.PropertyContext propertyContext: ctx.property()) {
            propName = propertyContext.propName().getText();
            propValue = new ArrayList<>();

            String value = null;
            VarType type = null;

            // если нам попалась обычная проперти - берем её значения
            for (cssParser.PropValueContext propValueContext: propertyContext.propValue()) {
                type = null;
                value = null;
                if (propValueContext.numberUnit() != null) {
                    type = VarType.NUMBERUNIT;
                    value = propValueContext.numberUnit().getText();
                } else if (propValueContext.number() != null) {
                    type = VarType.NUMBER;
                    value = propValueContext.number().getText();
                } else if (propValueContext.color() != null) {
                    type = VarType.COLOR;
                    value = propValueContext.color().getText();
                } else if (propValueContext.name() != null) {
                    type = VarType.PROPERTY;
                    value = propValueContext.name().getText();
                } else if (propValueContext.string() != null) {
                    type = VarType.STRING;
                    value = propValueContext.string().getText();
                }

                if (value != null) {
                    propValue.add(new Variable(type, value));
                }
            }
            // если нам попалась переменная - достаем её значения
            for (cssParser.VariableContext variableContext: propertyContext.variable()) {
                String varName = null;

                if (variableContext.getText() != null) {
                    varName = variableContext.getText();
                }

                // TODO: КАКОЙ-ТА ПИЗДЕЦ(((
                // TODO: скорее всего, порядок вывода свойств будет неверный из-за этого метода
                if (varName != null) {
                    propValue.addAll(memory.get(varName));
                }
            }
            cssClass.addProperty(propName, propValue);
        }

        classes.put(cssClass.getSelector(), cssClass);

        return super.visitCssBody(ctx);
    }
}
