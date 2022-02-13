package yajco.example.imperative.model.expression;

import yajco.annotation.StringToken;

public final class StringValue {
    private final String value;

    public StringValue(@StringToken String value) {
        this.value = value;
    }

    public String eval() {
        return getValue();
    }

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }
}
