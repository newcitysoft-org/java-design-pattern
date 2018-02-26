package com.newcitysoft.study.design_pattern.structural.adapter.audio;

import com.newcitysoft.study.design_pattern.structural.adapter.advanced.AdvancedMediaPlayer;
import com.newcitysoft.study.design_pattern.structural.adapter.advanced.Mp4Player;
import com.newcitysoft.study.design_pattern.structural.adapter.advanced.VlcPlayer;

public class MediaAdapter implements MediaPlayer {

   AdvancedMediaPlayer advancedMusicPlayer;

   public MediaAdapter(String audioType){
      if(audioType.equalsIgnoreCase("vlc") ){
         advancedMusicPlayer = new VlcPlayer();
      } else if (audioType.equalsIgnoreCase("mp4")){
         advancedMusicPlayer = new Mp4Player();
      }    
   }

   @Override
   public void play(String audioType, String fileName) {
      if(audioType.equalsIgnoreCase("vlc")){
         advancedMusicPlayer.playVlc(fileName);
      }else if(audioType.equalsIgnoreCase("mp4")){
         advancedMusicPlayer.playMp4(fileName);
      }
   }
}