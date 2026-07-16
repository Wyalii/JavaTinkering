import java.util.HashSet;
class Main{
    public static void main(String args[]){
        // set doesn't allow duplicates hmph..
        HashSet<String> cars = new HashSet<>();
         cars.add("Volvo");
         cars.add("BMW");
         cars.add("Ford");
         cars.add("BMW"); //duplicate is not added hehe 
         cars.add("Mazda");
         System.out.println(cars);
         System.err.println(cars.contains("Porche")); // alr this guy returns boolean

         cars.clear();// empties hash set
         System.out.println(cars);

         HashSet<Integer> myNumbers = new HashSet<>();
         myNumbers.add(1);
         myNumbers.add(3);
         myNumbers.add(6);
        //  for (Integer numb : myNumbers) {
        //      System.err.println(numb);
        //  }

        for( int i = 0; i <= 4; i ++){
           if(myNumbers.contains(i)){
            System.out.println(i +" was found :)");
           }
        }

    }
}