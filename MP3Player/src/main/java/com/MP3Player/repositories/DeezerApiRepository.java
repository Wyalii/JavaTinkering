package com.MP3Player.repositories;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import com.MP3Player.models.Track;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
public class DeezerApiRepository{
  private String defaultUrl = "https://api.deezer.com/";
  HttpClient client =  HttpClient.newHttpClient();
  private final ObjectMapper objectMapper = new ObjectMapper();
  public List<Track> getTracks()
  {
    try {
        HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(defaultUrl+ "search?q=metallica"))
        .GET()
        .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        JsonNode root = objectMapper.readTree(response.body());
        return objectMapper.convertValue(
          root.get("data"),
          new TypeReference<List<Track>>() {}
        );
    } catch (Exception e) {
        e.printStackTrace();
    }
    return null;
    
  }
  
}