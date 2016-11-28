package core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import parse.cssBaseVisitor;
import parse.cssParser;

public class Visitor extends cssBaseVisitor<Integer> {
    private Map<String, List<Variable>> memory;

    public Visitor() {
        super();
        memory = new HashMap<>();
    }

    @Override
    public Integer visitVarDefinition(cssParser.VarDefinitionContext ctx) {
        String id = ctx.variable().getText();
        String value = null;
        VarType type = null;
        List<Variable> varResult = new ArrayList<>();

        for (cssParser.PropValueContext valueContext: ctx.propValue()) {
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

        return 0;
    }


}
