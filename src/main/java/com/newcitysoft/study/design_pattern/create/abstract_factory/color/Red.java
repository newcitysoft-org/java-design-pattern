package com.newcitysoft.study.design_pattern.create.abstract_factory.color;
public class Red implements Color {

   @Override
   public void fill() {
      System.out.println("Inside Red::fill() method.");
   }
}