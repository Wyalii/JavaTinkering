package com.MP3Player.repositories;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashSet;

import com.MP3Player.models.Track;
public class DeezerApi{
  private String defaultUrl = "https://api.deezer.com/";
  HttpClient client =  HttpClient.newHttpClient();
  private HashSet<Track> tracks = new HashSet<>();
  public String getTracks()
  {
    try {
        HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(defaultUrl+ "search?q=metallica"))
        .GET()
        .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return null;
    
  }
  
}