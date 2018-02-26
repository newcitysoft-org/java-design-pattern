package com.newcitysoft.study.design_pattern.create.abstract_factory.color;
public class Green implements Color {

   @Override
   public void fill() {
      System.out.println("Inside Green::fill() method.");
   }
}