package com.newcitysoft.study.design_pattern.behavioral.iterator;

import java.util.Arrays;

/**
 * @author lixin.tian@renren-inc.com
 * @date 2018/2/24 16:39
 */
public class NameRepository implements Container {

    public String[] names = {"Robert" , "John" ,"Julie" , "Lora", "Robert" , "John" ,"Julie" , "Lora", "Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            if(index < names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }

//        @Override
//        public void foreach() {
//            Arrays.asList(names).forEach(name->{
//                System.out.println(String.format("Name:%s", name));
//            });
//        }
    }
}
