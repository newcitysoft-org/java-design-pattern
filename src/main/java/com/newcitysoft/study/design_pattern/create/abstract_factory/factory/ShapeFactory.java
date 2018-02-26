package com.newcitysoft.study.design_pattern.create.abstract_factory.factory;

import com.newcitysoft.study.design_pattern.create.abstract_factory.color.Color;
import com.newcitysoft.study.design_pattern.create.abstract_factory.shape.Circle;
import com.newcitysoft.study.design_pattern.create.abstract_factory.shape.Rectangle;
import com.newcitysoft.study.design_pattern.create.abstract_factory.shape.Shape;
import com.newcitysoft.study.design_pattern.create.abstract_factory.shape.Square;

public class ShapeFactory extends AbstractFactory {
    
   @Override
   public Shape getShape(String shapeType){
      if(shapeType == null){
         return null;
      }        
      if(shapeType.equalsIgnoreCase("CIRCLE")){
         return new Circle();
      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();
      } else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new Square();
      }
      return null;
   }
   
   @Override
   public Color getColor(String color) {
      return null;
   }
}