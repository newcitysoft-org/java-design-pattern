package com.newcitysoft.study.design_pattern.structural.proxy;

/**
 * @author lixin.tian@renren-inc.com
 * @date 2018/2/23 16:26
 */
public class RealImage implements Image {

   private String fileName;

   public RealImage(String fileName){
      this.fileName = fileName;
      loadFromDisk(fileName);
   }

   @Override
   public void display() {
      System.out.println("Displaying " + fileName);
   }

   private void loadFromDisk(String fileName){
      System.out.println("Loading " + fileName);
   }
}