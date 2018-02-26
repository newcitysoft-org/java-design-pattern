package com.newcitysoft.study.design_pattern.behavioral.chain;

/**
 * @author lixin.tian@renren-inc.com
 * @date 2018/2/23 17:54
 */
public class ErrorLogger extends AbstractLogger{
    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
