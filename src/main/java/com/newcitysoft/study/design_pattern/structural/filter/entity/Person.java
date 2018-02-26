package com.newcitysoft.study.design_pattern.structural.filter.entity;

/**
 * @author lixin.tian@renren-inc.com
 * @date 2018/2/23 11:13
 */
public class Person {
    /**
     * 姓名
     */
    private String name;
    /**
     * 性别
     */
    private String gender;
    /**
     * 婚姻状况
     */
    private String maritalStatus;

    public Person(String name,String gender,String maritalStatus){
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public String getMaritalStatus() {
        return maritalStatus;
    }
}
