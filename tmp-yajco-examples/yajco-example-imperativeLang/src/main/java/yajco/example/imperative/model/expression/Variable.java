package yajco.example.imperative.model.expression;

import yajco.example.imperative.machine.Machine;

import java.util.Optional;

public final class Variable implements Expression {
    private final String ident;
//    private Type type;
//
//    public Variable(Optional<Type> type, String ident) {
//        this.type = type.orElse(null);
//        this.ident = ident;
//    }

    public Variable(String ident) {
        this.ident = ident;
    }

    public long eval() {
        return Machine.getInstance().getValue(ident);
    }

    public String getIdent() {
        return ident;
    }
}
