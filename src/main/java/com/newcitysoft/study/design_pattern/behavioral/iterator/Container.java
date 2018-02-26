package com.newcitysoft.study.design_pattern.behavioral.iterator;

/**
 * @author lixin.tian@renren-inc.com
 * @date 2018/2/24 16:38
 */
public interface Container {
    /**
     * 获取迭代器对象
     * @return
     */
    Iterator getIterator();
}
