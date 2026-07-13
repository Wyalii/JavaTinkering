import java.nio.file.*;
import java.util.Scanner;
public class Main{
    public static void main(String[]args) {
       Scanner scanner = new Scanner(System.in);
       boolean isRunning = true;
       System.out.println("F I L E   M A N A G E R  <3");
       System.out.println("");
       while (isRunning) {
         Path currPath = Paths.get(System.getProperty("user.dir"));
         System.out.println("current working path:" + currPath);
         System.out.println();
         System.out.println("OPTIONS:");
         System.out.println("1 - create new directory");
         System.out.println("2 - create new file");
         System.out.println("3 - switch current path");         
         System.out.println("4 - Quit");
         
         int userChoice = scanner.nextInt();
         switch (userChoice) {
             case 1:
                 System.out.println(System.getProperty("user.dir"));
                 
                 break;
             case 4:
                isRunning = false;
                break;    
             default:
                 throw new AssertionError();
         } 
       }       
    }
}