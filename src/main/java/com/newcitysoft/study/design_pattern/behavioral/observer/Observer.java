package com.newcitysoft.study.design_pattern.behavioral.observer;

/**
 * @author lixin.tian@renren-inc.com
 * @date 2018/2/26 12:44
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
