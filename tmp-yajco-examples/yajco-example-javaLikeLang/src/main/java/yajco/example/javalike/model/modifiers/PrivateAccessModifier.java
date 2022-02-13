package yajco.example.javalike.model.modifiers;

import yajco.annotation.Before;

public class PrivateAccessModifier extends AccessModifier {
    @Before("private")
    public PrivateAccessModifier() {}
}
