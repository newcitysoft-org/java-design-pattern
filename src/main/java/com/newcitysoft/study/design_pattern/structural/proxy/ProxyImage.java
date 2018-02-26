package com.newcitysoft.study.design_pattern.structural.proxy;

/**
 * @author lixin.tian@renren-inc.com
 * @date 2018/2/23 16:26
 */
public class ProxyImage implements Image{

   private RealImage realImage;
   private String fileName;

   public ProxyImage(String fileName){
      this.fileName = fileName;
   }

   @Override
   public void display() {
      if(realImage == null){
         realImage = new RealImage(fileName);
      }
      realImage.display();
   }
}