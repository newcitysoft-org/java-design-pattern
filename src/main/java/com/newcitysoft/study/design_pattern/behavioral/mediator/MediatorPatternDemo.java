package com.newcitysoft.study.design_pattern.behavioral.mediator;

/**
 * @author lixin.tian@renren-inc.com
 * @date 2018/2/24 19:12
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
