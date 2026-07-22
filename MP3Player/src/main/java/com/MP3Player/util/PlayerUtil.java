package com.MP3Player.util;


import javazoom.jl.player.Player;
import java.io.InputStream;
import java.net.URL;

public class PlayerUtil{
  public void player(String previewUrl)
  {
    try {
            URL url = new URL(previewUrl);
            InputStream input = url.openStream();
            Player player = new Player(input);
            player.play();

        } catch (Exception e) {
            e.printStackTrace();
        }
  }
}