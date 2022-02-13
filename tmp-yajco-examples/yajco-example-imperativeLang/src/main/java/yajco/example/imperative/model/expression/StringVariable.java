package yajco.example.imperative.model.expression;

import yajco.example.imperative.machine.Machine;

public final class StringVariable {
    private final String ident;

    public StringVariable(String ident) {
        this.ident = ident;
    }

    public String eval() {
        return Machine.getInstance().getStringValue(ident);
    }

    public String getIdent() {
        return ident;
    }
}
