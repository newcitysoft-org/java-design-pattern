package com.newcitysoft.study.design_pattern.structural.bridge.shape;

import com.newcitysoft.study.design_pattern.structural.bridge.circle.DrawAPI;

/**
 * 形状抽象类
 * @author lixin.tian@renren-inc.com
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
