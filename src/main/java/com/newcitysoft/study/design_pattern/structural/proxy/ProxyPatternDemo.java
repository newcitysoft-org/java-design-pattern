package com.newcitysoft.study.design_pattern.structural.proxy;

/**
 * @author lixin.tian@renren-inc.com
 * @date 2018/2/23 16:26
 */
public class ProxyPatternDemo {
    
   public static void main(String[] args) {
      Image image = new ProxyImage("test_10mb.jpg");

      //图像将从磁盘加载
      image.display(); 
      System.out.println("");
      //图像将无法从磁盘加载
      image.display();     
   }
}