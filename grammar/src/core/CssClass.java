package core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CssClass {
    private String selector;
    private List<CssProperty> properties;

    public CssClass(String selector) {
        this.selector = selector;
        properties = new ArrayList<>();
    }

    public String getSelector() {
        return selector;
    }

    public void setSelector(String selector) {
        this.selector = selector;
    }

    public List<CssProperty> getProperties() {
        return properties;
    }

    public void setProperties(List<CssProperty> properties) {
        this.properties = properties;
    }

    public CssProperty getPropertyByName(String propName) {
        List<CssProperty> props = properties.stream().filter(prop -> prop.getName().equals(propName)).collect(Collectors.toList());
        if (props.size() > 0) {
            return props.get(0);
        }
        return null;
    }

    //TODO: поправить коллизию имен
    public void addProperty(CssProperty property) {
        this.properties.add(property);
    }

    //TODO: доделать вложенность
    // можно сделать минимизированную модификацию
    @Override
    public String toString() {
        String result = selector + " {\n";
        for (CssProperty property: properties) {
            result += "\t" + property.toString() + "\n";
        }
        result += "}\n";

        return result;
    }
}
