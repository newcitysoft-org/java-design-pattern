package com.newcitysoft.study.design_pattern.behavioral.memento;

/**
 * @author lixin.tian@renren-inc.com
 * @date 2018/2/26 11:24
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
