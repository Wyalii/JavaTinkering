package com.MP3Player.services;
import java.util.List;

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

  

}