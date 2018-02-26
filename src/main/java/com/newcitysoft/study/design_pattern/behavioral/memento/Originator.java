package com.newcitysoft.study.design_pattern.behavioral.memento;

/**
 * @author lixin.tian@renren-inc.com
 * @date 2018/2/26 11:26
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento Memento){
        state = Memento.getState();
    }
}
