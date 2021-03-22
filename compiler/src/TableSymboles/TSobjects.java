package TableSymboles;

import java.util.HashMap;

public class TSobjects {

    Object value;
    int declared;
    String type;

    public TSobjects(Object value, int declared, String type) {
        this.value = value;
        this.declared = declared;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
