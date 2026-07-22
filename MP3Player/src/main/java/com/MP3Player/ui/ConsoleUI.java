package com.MP3Player.ui;
import java.util.Scanner;

import com.MP3Player.services.DeezerService;
public class ConsoleUI{
    private Boolean isRunning = true;
    private DeezerService deezerService = new DeezerService();
    private Scanner scanner = new Scanner(System.in);
    public void start()
    {
        System.out.println();
        System.out.println("MP3 PLAYER IS RUNNING :)");
        while (isRunning) { 
            System.out.println();
            System.out.println("OPTIONS:");
            System.out.println("- - - - - -");
            System.out.println();
            System.out.println("1 - Get Tracks");
            System.out.println("2 - Search Tracks");
            System.out.println("3 - Play Preview");
            System.out.println("4 - Quit");
            Integer userOption = scanner.nextInt();
            scanner.nextLine();
            switch (userOption) {
                case 1:
                  deezerService.getTracksGeneral();
                    break;

                case 2:
                    System.out.println();
                    System.out.println("Type Search Query:");
                    String userQuery = scanner.nextLine();
                    deezerService.searchTracks(userQuery);
                    
                    break;    
                default:
                    throw new AssertionError();
            }
        }
    }
}