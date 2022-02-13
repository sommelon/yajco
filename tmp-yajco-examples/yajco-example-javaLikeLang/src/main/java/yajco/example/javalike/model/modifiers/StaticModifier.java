package yajco.example.javalike.model.modifiers;

import yajco.annotation.Before;

public class StaticModifier extends Modifier {
    @Before("final")
    public StaticModifier() {}
}
