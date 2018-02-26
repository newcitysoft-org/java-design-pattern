package com.newcitysoft.study.design_pattern.structural.facade.shape;

/**
 * @author lixin.tian@renren-inc.com
 * @date 2018/2/23 14:43
 */
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
