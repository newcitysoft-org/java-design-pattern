package com.newcitysoft.study.design_pattern.structural.bridge.shape;

import com.newcitysoft.study.design_pattern.structural.bridge.circle.DrawAPI;

/**
 * 圆类
 * @author lixin.tian@renren-inc.com
 * @date 2018-02-23 10:35
 */
public class Circle extends Shape{
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI){
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
