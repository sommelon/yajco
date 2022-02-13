package yajco.example.javalike.model;

import yajco.example.javalike.model.expression.Expression;
import yajco.example.javalike.model.modifiers.Modifiers;

public abstract class Attribute implements Expression {
    private Modifiers modifiers;
    private Variable variable;

    public Attribute(Modifiers modifiers, Variable variable) {
        this.modifiers = modifiers;
        this.variable = variable;
    }
}
