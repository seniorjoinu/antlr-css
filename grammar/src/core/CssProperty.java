package core;

import java.util.ArrayList;
import java.util.List;

public class CssProperty {
    private String name;
    private List<Variable> values;

    public CssProperty(String name) {
        this.name = name;
        values = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Variable> getValues() {
        return values;
    }

    public void setValues(List<Variable> values) {
        this.values = values;
    }

    public void addValue(Variable value) {
        this.values.add(value);
    }

    @Override
    public String toString() {
        String result = name + ": ";
        for (Variable var: values) {
            if (values.indexOf(var) > 0) {
                result += " ";
            }
            result += var;
        }
        result += ";";
        return result;
    }
}
