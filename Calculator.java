import java.util.Scanner;
class Calculator{
    
    public static int getNumber(Scanner scanner){
        while (true) { 
            try {
                System.out.println("Enter a number: ");
                return scanner.nextInt();
            } catch (Exception e) {
                System.err.println("please enter an integer.");
                scanner.nextLine();
            }
        }
      
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);    
        boolean isRunning = true;
        System.out.println("Calculator baby");
        while(isRunning){
          System.out.println("Avaiable operations:");
          System.out.println("1 - ADDITION:");
          System.out.println("2 - SUBSTRACTION:");
          System.out.println("3 - MULTIPLICATION:");
          System.out.println("4 - DIVISON:");
          System.out.println("5 - EXIT:");
          System.out.println();
          
          int numb1 = getNumber(scanner);
          int numb2 = getNumber(scanner);
          System.out.println();
          System.out.println("choose operation:");
          int operationId = scanner.nextInt();
          if (operationId == 1){
            System.out.println();
            int result = numb1 + numb2;
            System.out.println(result);                
            
          }
          if(operationId == 2){
            System.out.println();
            int result = numb1 - numb2;
            System.out.println(result);                
             
             
          }
          if(operationId == 3){
              System.out.println();
              int result = numb1 * numb2;
              System.out.println(result);                
            
            } 
          if(operationId == 4){
            
              int result = numb1/numb2;
              System.out.println("result: "+ result);
              System.out.println("cant divide by 0!");
            }
          
          if(operationId == 5){
            isRunning = false;
            scanner.close();
          }
        }
        

        
    }
}