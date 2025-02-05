import java.util.*;
public class HashMapInt{
    public static void main(String args[]){
        int arr[] = {8, 1, 2, 1, 3, 4, 3, 2, 1, 4, 7, 7, 6, 8};

        //      <Key   , Value>
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            //method(key, getOrDefault(previous nums value, 0)+1)
            // Store in Sorted Key Order
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        System.out.println(map);
        System.out.println(map.get(8)); // get Value
        

    }
}