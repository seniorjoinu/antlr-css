package core;

public class Variable {
    private VarType type;
    private Object data;

    public Variable(VarType type, Object data) {
        this.type = type;
        this.data = data;
        if (type == VarType.NUMBER || type == VarType.NUMBERUNIT) {
            if (doubleValue() == Math.round(doubleValue())) {
                if (type == VarType.NUMBERUNIT) {
                    String unit = "";
                    unit = data.toString().replaceAll("[0-9.]", "");
                    this.data = Math.round(doubleValue()) + unit;
                } else {
                    this.data = Math.round(doubleValue());
                }
            }
        }
    }

    public VarType getType() {
        return type;
    }

    public void setType(VarType type) {
        this.type = type;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Variable{" +
                "type=" + type +
                ", data=" + data +
                '}';
    }

    public Double doubleValue() {
        if (type == VarType.NUMBER) {
            if (data instanceof Double) {
                return (Double)data;
            } else if (data instanceof Long) {
                return ((Long)data).doubleValue();
            } else if (data instanceof String) {
                return Double.parseDouble(data.toString());
            } else {
                return 0.0;
            }
        } else if (type == VarType.NUMBERUNIT) {
            return Double.parseDouble(data.toString().replaceAll("[a-zA-Z_%-]", ""));
        } else {
            return 0.0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Variable variable = (Variable) o;

        if (this.type == variable.type) {
            if (this.type == VarType.NUMBER) {
                return this.doubleValue().equals(variable.doubleValue());
            } else {
                return this.data.equals(variable.data);
            }
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + (data != null ? data.hashCode() : 0);
        return result;
    }
}
