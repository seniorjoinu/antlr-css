package core;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class VirtualMachine {
    private Map<String, Variable> memory;
    private Map<String, CssClass> classes;
    private Stack<String> currentSelector;

    private String concatSelector() {
        String result = "";
        for (String s: currentSelector) {
            if (currentSelector.indexOf(s) != 0) {
                result += " ";
            }
            result += s;
        }
        return result;
    }

    public VirtualMachine() {
        memory = new HashMap<>();
        classes = new HashMap<>();
        currentSelector = new Stack<>();
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

    public void startClass(String selector) {
        currentSelector.push(selector);
        classes.putIfAbsent(concatSelector(), new CssClass(concatSelector()));
    }

    public void addProperty(CssProperty property) {
        classes.get(concatSelector()).addProperty(property);
    }

    public void endClass() {
        currentSelector.pop();
    }

    public void dumpClasses(String filename) throws IOException {
        PrintWriter writer = new PrintWriter(filename, "UTF-8");
        classes.values().forEach(writer::print);
        writer.close();
    }
}
