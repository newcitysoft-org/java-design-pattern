package com.newcitysoft.study.design_pattern.behavioral.command.entity;

/**
 * @author lixin.tian@renren-inc.com
 * @date 2018/2/24 12:40
 */
public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] bought");
    }

    public void sell(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] sold");
    }
}
