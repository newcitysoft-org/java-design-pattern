package com.newcitysoft.study.design_pattern.structural.decorator;

import com.newcitysoft.study.design_pattern.structural.decorator.shape.Circle;
import com.newcitysoft.study.design_pattern.structural.decorator.shape.Rectangle;
import com.newcitysoft.study.design_pattern.structural.decorator.shape.Shape;

/**
 * @author lixin.tian@renren-inc.com
 * @date 2018/2/23 14:03
 */
public class DecoratorPatternDemo {
   public static void main(String[] args) {

      Shape circle = new Circle();

      Shape redCircle = new RedShapeDecorator(new Circle());

      Shape redRectangle = new RedShapeDecorator(new Rectangle());
      System.out.println("Circle with normal border");
      circle.draw();

      System.out.println("\nCircle of red border");
      redCircle.draw();

      System.out.println("\nRectangle of red border");
      redRectangle.draw();
   }
}