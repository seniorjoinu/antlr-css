package core;

import java.util.Map;

public class CssClass {
    private String selector;
    private Map<String, String> properties;

    public CssClass(String selector) {
        this.selector = selector;
    }

    public String getSelector() {
        return selector;
    }

    public void setSelector(String selector) {
        this.selector = selector;
    }

    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

    public void addProperty(String propName, String propValue) {
        this.properties.put(propName, propValue);
    }
}
