@Parser(
    className = "yajco.example.javalike.parser.Parser",
    mainNode = "yajco.example.javalike.model.Program",
    tokens = {
        @TokenDef(name = "IDENT", regexp = "[a-zA-Z0-9_$]+"),
        @TokenDef(name = "VALUE", regexp = "[0-9]+"),
        @TokenDef(name = "ASSIGN", regexp = "="),
        @TokenDef(name = "CLASS", regexp = "class"),
    },
    skips = {
        @Skip(" "),
        @Skip("\\t"),
        @Skip("\\n"),
        @Skip("\\r"),
    }
)
package yajco.example.javalike.model;

import yajco.annotation.config.Parser;
import yajco.annotation.config.Skip;
import yajco.annotation.config.TokenDef;

