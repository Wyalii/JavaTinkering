package com.MP3Player.services;
import com.MP3Player.repositories.DeezerApiRepository;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.ArrayList;

import com.MP3Player.models.Artist;
import com.MP3Player.models.Track;
public class DeezerService{
   DeezerApiRepository deezerRepo = new DeezerApiRepository();
   ArrayList<Track> tracks = new ArrayList<>();
   public void test(){
    JsonNode response = deezerRepo.getTracks();
    for (JsonNode data : response) {
        tracks.add(mapToTrack(data));
    }
    System.out.println(tracks.get(0).toString());
   }

   private Track mapToTrack(JsonNode data) {
     Artist artist = new Artist(
        data.get("artist").get("id").asInt(),
        data.get("artist").get("name").asText(),
        data.get("artist").get("picture").asText()
    );
    Track track = new Track(
        data.get("id").asInt(),
        data.get("title").asText(),
        data.get("preview").asText(),
        artist
    );

    return track;
}

}