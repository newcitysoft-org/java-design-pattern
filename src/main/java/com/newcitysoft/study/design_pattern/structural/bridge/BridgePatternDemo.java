package com.newcitysoft.study.design_pattern.structural.bridge;

import com.newcitysoft.study.design_pattern.structural.bridge.circle.GreenCircle;
import com.newcitysoft.study.design_pattern.structural.bridge.circle.GreyCircle;
import com.newcitysoft.study.design_pattern.structural.bridge.circle.RedCircle;
import com.newcitysoft.study.design_pattern.structural.bridge.shape.Circle;
import com.newcitysoft.study.design_pattern.structural.bridge.shape.Shape;

/**
 * 桥接模式Demo类
 * @author lixin.tian@renren-inc.com
 * @date 2018/2/23 10:43
 */
public class BridgePatternDemo {

    public static void main(String[] args){
        Shape redCircle = new Circle(1, 2, 3, new RedCircle());
        Shape greenCircle = new Circle(2, 3, 4, new GreenCircle());
        Shape greyCircle = new Circle(3, 4, 5, new GreyCircle());

        redCircle.draw();
        greenCircle.draw();
        greyCircle.draw();
    }
}
