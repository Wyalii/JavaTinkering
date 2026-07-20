package com.MP3Player.services;
import java.util.ArrayList;
import java.util.List;

import com.MP3Player.models.Track;
import com.MP3Player.repositories.DeezerApiRepository;
public class DeezerService{
   DeezerApiRepository deezerRepo = new DeezerApiRepository();
   ArrayList<Track> tracks = new ArrayList<>();
   public void test(){
    List<Track> response = deezerRepo.getTracks();
    System.out.println(response.get(0));
   }

  

}