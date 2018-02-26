package com.newcitysoft.study.design_pattern.structural.decorator;


import com.newcitysoft.study.design_pattern.structural.decorator.shape.Shape;

/**
 * 红色形状装饰器
 * @author lixin.tian@renren-inc.com
 * @date 2018/2/23 13:58
 */
public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape decoratedShape){
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
