package com.newcitysoft.study.design_pattern.create.abstract_factory;

import com.newcitysoft.study.design_pattern.create.abstract_factory.factory.AbstractFactory;
import com.newcitysoft.study.design_pattern.create.abstract_factory.factory.ColorFactory;
import com.newcitysoft.study.design_pattern.create.abstract_factory.factory.ShapeFactory;

public class FactoryProducer {
   public static AbstractFactory getFactory(String choice){
      if(choice.equalsIgnoreCase("SHAPE")){
         return new ShapeFactory();
      } else if(choice.equalsIgnoreCase("COLOR")){
         return new ColorFactory();
      }
      return null;
   }
}