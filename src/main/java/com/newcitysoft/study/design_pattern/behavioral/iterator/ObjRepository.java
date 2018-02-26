package com.newcitysoft.study.design_pattern.behavioral.iterator;

import java.util.Arrays;

/**
 * @author lixin.tian@renren-inc.com
 * @date 2018/2/24 16:52
 */
public class ObjRepository implements Container{

    /**
     *
     */
    private static double ARRAY_GROWTH_MULTIPLES = 0.75;
    /**
     * 默认容量
     */
    private static int DEFAULT_CAPACITY = 10;
    /**
     * 对象数组
     */
    private static Object[] objects = new Object[DEFAULT_CAPACITY];
    /**
     * 已使用量=数组总量-剩余量
     */
    private static int used = 0;
    /**
     * 剩余量
     */
    private static int remaining = DEFAULT_CAPACITY;

    public ObjRepository(){
    }

    public ObjRepository(Object...objects){
        put(objects);
    }

    public void put(Object...obj){
        if(obj.length > remaining){
            reshape();
        }
        System.arraycopy(obj,0, objects, used, obj.length);
        used += obj.length;
        remaining = objects.length - used;
        System.out.println(String.format("used:%d,remaining:%d", used, remaining));
    }

    private static void reshape(){
        int newLength = (int) (objects.length* ARRAY_GROWTH_MULTIPLES);
        objects = Arrays.copyOf(objects, objects.length+newLength);
    }

    @Override
    public Iterator getIterator() {
        return new ObjIterator();
    }

    private class ObjIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            if(index < objects.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return objects[index++];
            }
            return null;
        }
    }
}
