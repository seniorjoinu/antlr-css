package core;

public class Variable {
    private VarType type;
    private Object data;

    public Variable(VarType type, Object data) {
        this.type = type;
        this.data = data;
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

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Variable{" +
                "type=" + type +
                ", data=" + data +
                '}';
    }
}
