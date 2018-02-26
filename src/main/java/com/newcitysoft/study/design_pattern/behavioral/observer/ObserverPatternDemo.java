package com.newcitysoft.study.design_pattern.behavioral.observer;

/**
 * @author lixin.tian@renren-inc.com
 * @date 2018/2/26 12:46
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}