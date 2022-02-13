package yajco.example.javalike.model;

import yajco.example.javalike.model.expression.Expression;

public class Variable implements Expression {
    private final String ident;

    public Variable(String ident) {
        this.ident = ident;
    }

    public long eval() {
        return 0;
    }

    public String getIdent() {
        return ident;
    }
}
