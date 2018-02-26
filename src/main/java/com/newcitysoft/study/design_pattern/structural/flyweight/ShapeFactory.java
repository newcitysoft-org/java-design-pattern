package com.newcitysoft.study.design_pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lixin.tian@renren-inc.com
 * @date 2018/2/23 15:07
 */
public class ShapeFactory {
    private static final Map<String, Shape> shapeMap = new HashMap<String, Shape>();

    public static Shape getCircle(String color){
        Circle circle = (Circle) shapeMap.get(color);

        if(circle==null){
            circle = new Circle(color);

            shapeMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }

        return circle;
    }
}
