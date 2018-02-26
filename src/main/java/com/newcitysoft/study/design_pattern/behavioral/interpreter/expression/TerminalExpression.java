package com.newcitysoft.study.design_pattern.behavioral.interpreter.expression;

/**
 * @author lixin.tian@renren-inc.com
 * @date 2018/2/24 15:57
 */
public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
