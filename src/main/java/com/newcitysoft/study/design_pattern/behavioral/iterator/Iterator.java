package com.newcitysoft.study.design_pattern.behavioral.iterator;

/**
 * @author lixin.tian@renren-inc.com
 * @date 2018/2/24 16:37
 */
public interface Iterator {
    /**
     * 判断是否有下一个元素
     * @return
     */
    boolean hasNext();

    /**
     * 遍历下一个元素
     * @return
     */
    Object next();

    //void foreach();
}
