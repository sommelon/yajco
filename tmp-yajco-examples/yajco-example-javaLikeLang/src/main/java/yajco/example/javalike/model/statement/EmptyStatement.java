package yajco.example.javalike.model.statement;

import yajco.annotation.After;

public class EmptyStatement implements Statement {
    @After("SEMICOLON")
    public EmptyStatement() {
    }
    
    @Override
    public void execute() {        
    }
}
