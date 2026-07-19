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
            System.out.println("3 - Quit");
            Integer userOption = scanner.nextInt();
            switch (userOption) {
                case 1:
                  deezerService.test();
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
}