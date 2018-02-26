package com.newcitysoft.study.design_pattern.behavioral.iterator;

/**
 * @author lixin.tian@renren-inc.com
 * @date 2018/2/24 17:44
 */
public class Person {
    private String name;
    private Gender gender;
    private int age;

    public Person(String name, Gender gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public enum Gender{
        FAMALE, MALE;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
