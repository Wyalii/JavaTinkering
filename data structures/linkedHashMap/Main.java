import java.util.LinkedHashMap;
class Main{
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> people = new LinkedHashMap<>();
        people.put(1, "Giorgi");
        people.put(2, "Nika");
        people.put(3, "Levani");
        people.put(4, "Mtevani");
        System.out.println(people);
    }
}