package TableSymboles;

public class TSobjects {
    Object value;
    int declared;
    int type;  //0 Integer, 1 float, 2 string

    public TSobjects(Object value, int declared, int type) {
        this.value = value;
        this.declared = 0;
        this.type = type;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public int getDeclared() {
        return declared;
    }

    public void setDeclared(int declared) {
        this.declared = declared;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
