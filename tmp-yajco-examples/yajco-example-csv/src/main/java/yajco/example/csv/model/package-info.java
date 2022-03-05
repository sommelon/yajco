@Parser(
    className = "yajco.example.csv.parser.CsvParser",
    mainNode = "Values",
    tokens = {
        @TokenDef(name = "VALUE", regexp = "([-]?[0-9]+(\\.[0-9]+)?([eE][+-][0-9]+)?)"),
    },
    skips = {
        @Skip("[ ]"),
        @Skip("[\\t]"),
        @Skip("[\\n]"),
        @Skip("[\\r]")
    }
)
package yajco.example.csv.model;

import yajco.annotation.config.Parser;
import yajco.annotation.config.Skip;
import yajco.annotation.config.TokenDef;
