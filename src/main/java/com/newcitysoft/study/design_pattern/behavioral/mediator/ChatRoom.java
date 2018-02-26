package com.newcitysoft.study.design_pattern.behavioral.mediator;

import java.util.Date;

/**
 * @author lixin.tian@renren-inc.com
 * @date 2018/2/24 19:11
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
