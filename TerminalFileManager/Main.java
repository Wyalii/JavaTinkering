import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;
public class Main{
    public static void main(String[]args) {
        Path currPath = Paths.get(System.getProperty("user.dir"));
       Scanner scanner = new Scanner(System.in);
       boolean isRunning = true;
       System.out.println("F I L E   M A N A G E R  <3");
       System.out.println("");
       while (isRunning) {
         System.out.println("current working path:" + currPath);
         System.out.println();
         System.out.println("OPTIONS:");
         System.out.println("1 - create new directory");
         System.out.println("2 - create new file");
         System.out.println("3 - switch current path");         
         System.out.println("4 - Quit");
         
         int userChoice = scanner.nextInt();
         scanner.nextLine();
         switch (userChoice) {
             case 1:
                 try {
                     System.out.println();
                     System.out.println("write name of new directory:");
                     String folderName = scanner.nextLine();
                     Path folder = currPath.resolve(folderName);
                     Files.createDirectory(folder);
                     System.out.println("created directory at: " + folder);
                 } catch (IOException e) {
                    System.out.println("Error creating directory: " + e.getMessage());

                 }
               break;

              case 2 :
                 try {
                    System.out.println();
                    System.out.println("write name of new file:");
                    String fileName = scanner.nextLine();
                    Path file = currPath.resolve(fileName);
                    Files.createFile(file);
                    System.out.println("created file at: "+ file);
                     
                 } catch (IOException e) {
                    System.out.println("Error creating file: " + e.getMessage());
                 }
               break;

               case 3:
                try {
                    System.out.println("write new path: ");
                    String newPath = scanner.nextLine();
                    if(Files.exists(Path.of(newPath))){
                        currPath = Path.of(newPath);
                    }else{
                        System.out.println("path doesn't exists");
                    }
                } catch (Exception e) {
                }
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