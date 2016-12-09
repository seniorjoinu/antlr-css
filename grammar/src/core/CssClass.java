package core;

import java.util.*;
import java.util.stream.Collectors;

public class CssClass {
    private String selector;
    private Map<String, CssProperty> properties;

    public CssClass(String selector) {
        this.selector = selector;
        properties = new TreeMap<>();
    }

    public String getSelector() {
        return selector;
    }

    public void setSelector(String selector) {
        this.selector = selector;
    }

    public Map<String, CssProperty> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, CssProperty> properties) {
        this.properties = properties;
    }

    public CssProperty getPropertyByName(String propName) {
        return properties.get(propName);
    }

    //TODO: поправить коллизию имен
    public void addProperty(CssProperty property) {
        this.properties.put(property.getName(), property);
    }

    //TODO: доделать вложенность
    // можно сделать минимизированную модификацию
    @Override
    public String toString() {
        if (properties.size() > 0) {
            String result = selector + " {\n";
            for (CssProperty property : properties.values()) {
                result += "\t" + property.toString() + "\n";
            }
            result += "}\n";
            return result;
        } else {
            return "";
        }
    }
}
