package com.MP3Player.services;
import java.util.List;
import com.MP3Player.util.PlayerUtil;

import com.MP3Player.models.Track;
import com.MP3Player.repositories.DeezerApiRepository;
public class DeezerService{
   DeezerApiRepository deezerRepo = new DeezerApiRepository();
   public void getTracksGeneral(){
    List<Track> response = deezerRepo.getTracks();
    System.out.println(response);
   }
   public void searchTracks(String queryString)
   {
     List<Track> response = deezerRepo.searchTrack(queryString);
     System.out.println(response);
   }

   public void playTrack(Long id)
   {
     Track track = deezerRepo.getTrack(id);
     PlayerUtil playerUtil = new PlayerUtil();
     if (track != null)
     {
       System.out.println();
       System.out.println("playing MP3...");
       playerUtil.player(track.getPreview());
     }else{
      System.out.println("something went wrong.");
      System.out.println(track);
     }
   }

  

}