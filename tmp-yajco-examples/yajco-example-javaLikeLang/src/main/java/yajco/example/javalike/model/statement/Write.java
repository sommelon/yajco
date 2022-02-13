package yajco.example.javalike.model.statement;

import yajco.annotation.After;
import yajco.annotation.Before;
import yajco.example.javalike.model.expression.Expression;

public class Write implements Statement {
    private final Expression expression;
    
    public Write(@Before("WRITE") @After("SEMICOLON") Expression expression) {
        this.expression = expression;
    }
    
    @Override
    public void execute() {
//        Machine.getInstance().write(getExpression().eval());
    }

    /**
     * @return the expression
     */
    public Expression getExpression() {
        return expression;
    }
}
