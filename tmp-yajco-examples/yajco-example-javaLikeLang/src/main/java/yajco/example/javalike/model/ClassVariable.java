package yajco.example.javalike.model;

import yajco.example.javalike.model.modifiers.Modifiers;

public class ClassVariable extends Variable {
    private Modifiers modifiers;

    public ClassVariable(Modifiers modifiers, String ident) {
        super(ident);
        this.modifiers = modifiers;
    }

    @Override
    public long eval() {
        return 0;
    }
}
