package com.newcitysoft.study.design_pattern.create.abstract_factory.factory;

import com.newcitysoft.study.design_pattern.create.abstract_factory.color.Blue;
import com.newcitysoft.study.design_pattern.create.abstract_factory.color.Color;
import com.newcitysoft.study.design_pattern.create.abstract_factory.color.Green;
import com.newcitysoft.study.design_pattern.create.abstract_factory.color.Red;
import com.newcitysoft.study.design_pattern.create.abstract_factory.shape.Shape;

public class ColorFactory extends AbstractFactory {
    
   @Override
   public Shape getShape(String shapeType){
      return null;
   }
   
   @Override
   public Color getColor(String color) {
      if(color == null){
         return null;
      }        
      if(color.equalsIgnoreCase("RED")){
         return new Red();
      } else if(color.equalsIgnoreCase("GREEN")){
         return new Green();
      } else if(color.equalsIgnoreCase("BLUE")){
         return new Blue();
      }
      return null;
   }
}