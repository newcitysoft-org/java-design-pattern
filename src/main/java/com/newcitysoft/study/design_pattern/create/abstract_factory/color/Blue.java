package com.newcitysoft.study.design_pattern.create.abstract_factory.color;
public class Blue implements Color {

   @Override
   public void fill() {
      System.out.println("Inside Blue::fill() method.");
   }
}