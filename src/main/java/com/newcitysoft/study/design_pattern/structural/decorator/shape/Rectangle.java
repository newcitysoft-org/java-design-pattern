package com.newcitysoft.study.design_pattern.structural.decorator.shape;

/**
 * @author lixin.tian@renren-inc.com
 * @date 2018/2/23 13:54
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
