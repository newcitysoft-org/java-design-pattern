package com.newcitysoft.study.design_pattern.behavioral.observer;

/**
 * @author lixin.tian@renren-inc.com
 * @date 2018/2/26 12:45
 */
public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}