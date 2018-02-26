package com.newcitysoft.study.design_pattern.behavioral.observer;

/**
 * @author lixin.tian@renren-inc.com
 * @date 2018/2/26 12:46
 */
public class OctalObserver extends Observer{

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }
}
