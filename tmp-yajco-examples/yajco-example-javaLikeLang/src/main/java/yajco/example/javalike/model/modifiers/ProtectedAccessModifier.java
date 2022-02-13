package yajco.example.javalike.model.modifiers;

import yajco.annotation.Before;

public class ProtectedAccessModifier extends AccessModifier {
    @Before("protected")
    public ProtectedAccessModifier() {}
}
