package com.newcitysoft.study.design_pattern.behavioral.mediator;

/**
 * @author lixin.tian@renren-inc.com
 * @date 2018/2/24 19:11
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name){
        this.name  = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}