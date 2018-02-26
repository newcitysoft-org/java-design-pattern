package com.newcitysoft.study.design_pattern.behavioral.interpreter.expression;

/**
 * @author lixin.tian@renren-inc.com
 * @date 2018/2/24 15:58
 */
public class OrExpression implements Expression {

    private Expression expr1 = null;
    private Expression expr2 = null;

    public OrExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) || expr2.interpret(context);
    }
}
