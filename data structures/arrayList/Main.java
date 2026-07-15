
import java.util.ArrayList;
import java.util.Arrays;
public class Main{
    public static void main(String args[]){
        ArrayList<String> foodList = new ArrayList<>();
        
        foodList.add("Banana");
        foodList.add("Kinhkali");
        foodList.add("Khachapuri");
        foodList.add("Apple"); 
        foodList.add("Bread");
        System.out.println(foodList);
        // for(String food:foodList){
        //     System.out.println(food);
        // }

        String[] newFoodList = new String[3];
        newFoodList[0] = "Mwvadi";
        newFoodList[1] = "Beans";
        newFoodList[2] = "Fish";
        // for(String food:newFoodList){
        //     System.out.println(food);
        // }

        // for(int i = 0; i < newFoodList.length;i++){
        //     System.out.println(newFoodList[i]);
        // }
        
        System.out.println(newFoodList);
        foodList.addAll(Arrays.asList(newFoodList));
        System.out.println(foodList);
        System.out.println(foodList.get(7));
        foodList.removeAll(Arrays.asList(newFoodList));
        System.out.println(foodList);
        System.err.println(foodList.clone());
        // Collections.sort(foodList);
        foodList.sort(null);
        System.out.println("S O R T E D ");
        System.out.println("");
        for (String f:foodList){
            System.err.println(f);
        }
        
        
    }
}