package com.newcitysoft.study.design_pattern.behavioral.chain;

/**
 * @author lixin.tian@renren-inc.com
 * @date 2018/2/23 17:53
 */
public class ConsoleLogger extends AbstractLogger{
    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
