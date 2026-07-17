import java.util.HashMap;
class Main{
    public static void main(String[] args) {
        HashMap<String,String> capitalCities = new HashMap<>();
         capitalCities.put("England", "London");
         capitalCities.put("India", "New Dehli");
         capitalCities.put("Austria", "Wien");
         capitalCities.put("Norway", "Oslo");
         capitalCities.put("Norway", "Oslo"); // Duplicate
         capitalCities.put("USA", "Washington DC");
         System.out.println(capitalCities);
         //doesn't maintain order.
         System.out.println(capitalCities.get("Austria"));
         System.out.println(capitalCities.remove("Norway"));
         System.out.println(capitalCities);
         System.out.println();
         System.out.println("KEYS:");
         for (String key : capitalCities.keySet()) {
             System.out.println(key);
         }
         System.out.println();
         System.out.println("VALUES:");
         for (String val : capitalCities.values()) {
             System.out.println(val);
         }



         HashMap<Integer,String> people = new HashMap<>();
         people.put(1, "John");
         people.put(1, "John"); 
         people.put(2, "George");
         people.put(3, "Derrick Rose");
         people.put(4, "John Wall");
         System.out.println(people);
         
    }
}