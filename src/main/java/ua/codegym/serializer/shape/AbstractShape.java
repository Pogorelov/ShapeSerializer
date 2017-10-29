package ua.codegym.serializer.shape;

import java.io.Serializable;

public class AbstractShape implements Shape, Serializable {

    protected String format(String attrName, Number attrValue) {
        return String.format(" %s=\"%s\"", attrName, attrValue.toString());
    }

    public String getType() {
        return this.getClass().getCanonicalName();
    }
}
