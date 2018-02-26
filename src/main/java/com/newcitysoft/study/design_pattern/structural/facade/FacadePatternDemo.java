package com.newcitysoft.study.design_pattern.structural.facade;

/**
 * @author lixin.tian@renren-inc.com
 * @date 2018/2/23 14:47
 */
public class FacadePatternDemo {
    public static void main(String[] args){
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
