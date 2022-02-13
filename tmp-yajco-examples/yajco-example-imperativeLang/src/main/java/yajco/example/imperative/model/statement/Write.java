package yajco.example.imperative.model.statement;

import yajco.annotation.After;
import yajco.annotation.Before;
import yajco.annotation.StringToken;
import yajco.example.imperative.machine.Machine;
import yajco.example.imperative.model.expression.Expression;

public class Write implements Statement {
    private Expression expression;
    private String str;

    public Write(@Before("WRITE") @After("SEMICOLON") Expression expression) {
        this.expression = expression;
    }

    public Write(@Before("WRITE") @After("SEMICOLON") @StringToken String str) {
        this.str = str;
    }

    @Override
    public void execute() {
        if (expression != null) {
            Machine.getInstance().write(getExpression().eval());
        }
        if (str != null) {
            Machine.getInstance().write(getStr());
        }
    }

    /**
     * @return the expression
     */
    public Expression getExpression() {
        return expression;
    }

    public String getStr() {
        return str;
    }
}
