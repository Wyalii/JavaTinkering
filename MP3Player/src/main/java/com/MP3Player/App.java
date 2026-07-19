package com.MP3Player;
import com.MP3Player.repositories.DeezerApi;
public class App 
{
    public static void main( String[] args )
    {
        DeezerApi deezerApiRepository = new DeezerApi();
        System.out.println(deezerApiRepository.getTracks());
    }
}
