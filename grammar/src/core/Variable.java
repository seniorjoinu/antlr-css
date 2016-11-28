package core;

public class Variable {
    private VarType type;
    private String data;

    public Variable(VarType type, String data) {
        this.type = type;
        this.data = data;
    }

    public VarType getType() {
        return type;
    }

    public void setType(VarType type) {
        this.type = type;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
