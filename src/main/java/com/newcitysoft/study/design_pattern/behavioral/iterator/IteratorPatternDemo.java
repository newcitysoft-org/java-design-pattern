package com.newcitysoft.study.design_pattern.behavioral.iterator;

/**
 * @author lixin.tian@renren-inc.com
 * @date 2018/2/24 16:42
 */
public class IteratorPatternDemo {
    public static void main(String[] args){
        NameRepository namesRepository = new NameRepository();

//        namesRepository.getIterator().foreach();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
