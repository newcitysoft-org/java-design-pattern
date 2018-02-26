package com.newcitysoft.study.design_pattern.structural.decorator;

import com.newcitysoft.study.design_pattern.structural.decorator.shape.Shape;

/**
 * 形状装饰器抽象类
 * @author lixin.tian@renren-inc.com
 * @date 2018/2/23 13:55
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
