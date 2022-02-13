package yajco.example.javalike.model.modifiers;

import yajco.annotation.Before;

public class FinalModifier extends Modifier {
    @Before("final")
    public FinalModifier() {}
}
