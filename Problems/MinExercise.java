import java.util.*;
public class MinExercise{
    public static void main(String args[]){
        int energy = 6;
        int[] exercise = {1, 2};
        int ans = MinExercise(energy, exercise);
        System.out.println(ans);
    }

    static int MinExercise(int energy, int[] exercise){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int num : exercise){ // Doubling the Array
            arr.add(num);
            arr.add(num);
        }

        Collections.sort(arr, Collections.reverseOrder()); // Sorting in Descending Order
        int minEx = 0;

        for(int i=0; i<arr.size(); i++){
            int val = arr.get(i);
            if(val <= energy){
                energy -= arr.get(i);
                minEx++;
            }

        }
        if(energy > 0) return -1;
        return minEx;
    }
}