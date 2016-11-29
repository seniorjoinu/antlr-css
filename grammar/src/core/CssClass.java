package core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CssClass {
    private String selector;
    private Map<String, List<Variable>> properties;

    public CssClass(String selector) {
        this.selector = selector;
        properties = new HashMap<>();
    }

    public String getSelector() {
        return selector;
    }

    public void setSelector(String selector) {
        this.selector = selector;
    }

    public Map<String, List<Variable>> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, List<Variable>> properties) {
        this.properties = properties;
    }

    public List<Variable> getProperty(String propName) {
        return properties.get(propName);
    }

    public void setProperty(String propName, Integer varIndex, Variable varValue) {
        properties.get(propName).set(varIndex, varValue);
    }

    public void addProperty(String propName, List<Variable> properties) {
        this.properties.put(propName, properties);
    }

    // можно сделать минимизированную модификацию
    @Override
    public String toString() {
        String result = selector + " {\n";
        for (Map.Entry<String, List<Variable>> property: properties.entrySet()) {
            result += property.getKey() + ": ";
            //TODO: возможно, тут тоже проблема в порядке свойств
            for (Variable variable: property.getValue()) {
                result += variable.getData() + " ";
            }
            result += ";\n";
        }
        result += "}\n";

        return result;
    }
}
