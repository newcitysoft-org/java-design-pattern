package com.newcitysoft.study.design_pattern.behavioral.iterator;

/**
 * @author lixin.tian@renren-inc.com
 * @date 2018/2/24 17:28
 */
public class ObjIteratorDemo {
    public static void main(String[] args){
        String[] names = {"Robert" , "John" ,"Julie" , "Lora", "Robert" , "John" ,"Julie" , "Lora", "Robert" , "John" ,"Julie" , "Lora"};

        Person[] persons = {
                new Person("tianlixin", Person.Gender.MALE, 26),
                new Person("anlihong", Person.Gender.FAMALE, 25),
                new Person("zhaiyinghao", Person.Gender.MALE, 25),
                new Person("wangshang", Person.Gender.MALE, 26),
        };

        Container container = new ObjRepository(persons);

        for(Iterator iterator = container.getIterator(); iterator.hasNext();){
            Object object = iterator.next();
            if(object!=null) {
                System.out.println(object);
            }
        }
    }
}
