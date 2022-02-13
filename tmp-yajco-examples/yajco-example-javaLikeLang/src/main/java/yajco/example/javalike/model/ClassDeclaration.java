package yajco.example.javalike.model;

import yajco.annotation.Before;
import yajco.annotation.reference.Identifier;
import yajco.example.javalike.model.statement.Block;

public class ClassDeclaration {
    @Identifier
    private String name;

    public ClassDeclaration(@Before("CLASS") String ident, Block block) {
        this.name = ident;
    }
}
