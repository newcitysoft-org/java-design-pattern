package com.newcitysoft.study.design_pattern.structural.adapter.advanced;

public class VlcPlayer implements AdvancedMediaPlayer{
   @Override
   public void playVlc(String fileName) {
      System.out.println("Playing vlc file. Name: "+ fileName);        
   }

   @Override
   public void playMp4(String fileName) {
      //什么也不做
   }
}