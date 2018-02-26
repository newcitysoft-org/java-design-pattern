package com.newcitysoft.study.design_pattern.behavioral.interpreter.expression;

/**
 * @author lixin.tian@renren-inc.com
 * @date 2018/2/24 15:57
 */
public interface Expression {
    /**
     *
     * @param context
     * @return
     */
    boolean interpret(String context);
}
