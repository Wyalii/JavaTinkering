import java.util.Collections;
import java.util.LinkedList;
class Main{
    public static void main(String args[]){
      LinkedList<String> cars = new LinkedList<>();
      cars.add("Volvo");
      cars.add("BMW");
      cars.add("Ford");
      cars.add("Mazda");
      System.out.println(cars);
      System.out.println(cars.getFirst()+"  FIRST ELEMENT");
      System.out.println(cars.getLast()+ "  LAST ELEMENT");
      cars.sort(null);
      System.out.println();
      System.out.println("S O R T E D");
      System.out.println(cars);
      System.out.println(cars.getFirst()+ "  FIRST ELEMENT");
      System.out.println(cars.getLast()+ "  LAST ELEMENT");
      System.out.println();
      System.out.println(cars.removeFirst() + "   REMOVED FIRST ");
      System.out.println(cars.removeLast() + "   REMOVED Last ");
      System.out.println();
      System.out.println(cars);
      System.out.println();
      Collections.sort(cars,Collections.reverseOrder());
      System.out.println(cars);
    
    }
}