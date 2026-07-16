import java.util.TreeSet;
class Main{
    public static void main(String args[]){
       TreeSet<String> cars = new TreeSet<>();
       cars.add("Volvo");
       cars.add("BMW");
       cars.add("Ford");
       cars.add("Mazda");
       System.out.println(cars); //tree set automaticly sorts elements so it prints in order

       TreeSet<Integer> myNumbers = new TreeSet<>((a,b) -> b - a); // gets lambda that tells how to sort elements
       myNumbers.add(11);
       myNumbers.add(1);
       myNumbers.add(111);
       myNumbers.add(1122);
       System.out.println(myNumbers);
    }
}