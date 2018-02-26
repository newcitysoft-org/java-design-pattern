package com.newcitysoft.study.design_pattern.structural.facade;

import com.newcitysoft.study.design_pattern.structural.facade.shape.Circle;
import com.newcitysoft.study.design_pattern.structural.facade.shape.Rectangle;
import com.newcitysoft.study.design_pattern.structural.facade.shape.Shape;
import com.newcitysoft.study.design_pattern.structural.facade.shape.Square;

/**
 * @author lixin.tian@renren-inc.com
 * @date 2018/2/23 14:44
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker(){
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }

    public void drawSquare(){
        square.draw();
    }
}
