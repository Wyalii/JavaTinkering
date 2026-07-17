import java.util.TreeMap;
class Main{
    public static void main(String[] args) {
        TreeMap<Integer,String> people = new TreeMap<>();
        people.put(1, "Giorgi");
        people.put(2, "Nika");
        people.put(3, "Levani");
        people.put(4, "Mtevani");
        System.out.println(people);
        // maintains order by key

        // System.out.println(people.ceilingEntry(1));
        // people.ceilingKey(key);
        people.compute(1, (key,value) -> value + 1);
        System.out.println(people);

    }
}