import java.util.*;
public class BasicHashMap{
    public static void main(String args[]){
        HashMap<String, Integer> rating = new HashMap<>();

        rating.put("Kadhai Paneer", 8);
        rating.put("Matar Paneer", 7);
        rating.put("Dosa", 8);
        rating.put("Gulab Jamun", 9);
        rating.put("Momos", 6);

        // Constant Time - O(1)
        System.out.println(rating);
        System.out.println(rating.get("Matar Paneer"));
        System.out.println(rating.containsKey("Rashgulla"));

        Set<String> dish = rating.keySet();
        System.out.println(dish); // Print All Keys

        System.out.println(rating.remove("Dosa"));
        System.out.println(rating);
        rating.clear();
        System.out.println(rating.isEmpty());
        System.out.println(rating);


    }
}