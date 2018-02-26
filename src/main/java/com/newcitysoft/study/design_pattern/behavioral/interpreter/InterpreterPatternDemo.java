package com.newcitysoft.study.design_pattern.behavioral.interpreter;

import com.newcitysoft.study.design_pattern.behavioral.interpreter.expression.AndExpression;
import com.newcitysoft.study.design_pattern.behavioral.interpreter.expression.Expression;
import com.newcitysoft.study.design_pattern.behavioral.interpreter.expression.OrExpression;
import com.newcitysoft.study.design_pattern.behavioral.interpreter.expression.TerminalExpression;

/**
 * @author lixin.tian@renren-inc.com
 * @date 2018/2/24 15:59
 */
public class InterpreterPatternDemo {


    /**
     * 规则：Robert 和 John 是男性
     * @return
     */
    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    /**
     * 规则：Julie 是一个已婚的女性
     * @return
     */
    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? "
                + isMarriedWoman.interpret("Married Julie"));
    }
}
