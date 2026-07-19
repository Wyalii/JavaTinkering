package com.MP3Player.repositories;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
public class DeezerApiRepository{
  private String defaultUrl = "https://api.deezer.com/";
  HttpClient client =  HttpClient.newHttpClient();
  public JsonNode getTracks()
  {
    try {
        HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(defaultUrl+ "search?q=metallica"))
        .GET()
        .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(response.body());
        return root.get("data");
    } catch (Exception e) {
        e.printStackTrace();
    }
    return null;
    
  }
  
}