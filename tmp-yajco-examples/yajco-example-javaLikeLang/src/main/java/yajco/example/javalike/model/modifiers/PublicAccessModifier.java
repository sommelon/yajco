package yajco.example.javalike.model.modifiers;

import yajco.annotation.Before;

public class PublicAccessModifier extends AccessModifier {
    @Before("public")
    public PublicAccessModifier() {}
}
