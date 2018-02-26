package com.newcitysoft.study.design_pattern.create.abstract_factory.shape;
public class Square implements Shape {

   @Override
   public void draw() {
      System.out.println("Inside Square::draw() method.");
   }
}