package core;

import java.util.HashMap;
import java.util.Map;

public class VirtualMachine {
    private Map<String, Variable> memory;
    private Map<String, CssClass> classes;

    public VirtualMachine() {
        memory = new HashMap<>();
        classes = new HashMap<>();
    }

    public void storeVariable(String name, Variable var) {
        memory.put(name, var);
    }

    public void unstoreVariable(String name) {
        memory.remove(name);
    }

    public Variable getVariable(String name) {
        return memory.get(name);
    }

    public VarType checkTypeSimilarity(Variable var1, Variable var2) {
        if (var1.getType() == VarType.NUMBERUNIT && var2.getType() == VarType.NUMBERUNIT) {
            return VarType.NUMBERUNIT;
        } else if (var1.getType() == VarType.NUMBER && var2.getType() == VarType.NUMBER) {
            return VarType.NUMBER;
        } else if (var1.getType() == VarType.STRING && var2.getType() == VarType.STRING) {
            return VarType.STRING;
        } else if (var1.getType() == VarType.COLOR && var2.getType() == VarType.COLOR) {
            return VarType.COLOR;
        } else if (var1.getType() == VarType.PROPERTY && var2.getType() == VarType.PROPERTY) {
            return VarType.PROPERTY;
        } else {
            return VarType.NONE;
        }
    }
}
