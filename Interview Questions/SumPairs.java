import java.util.*;
public class SumPairs{
    public static void main(String[] args){
        int[] arr = {1, 3, 5, 7, 9};
        int k = 2;
        // SumPairs(arr, k);
        SumPairs2(arr, k);

    }

    static void SumPairs(int[] arr, int k){
        int n = arr.length;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]+k==arr[j]){
                    System.out.println("("+arr[i] + ","+arr[j]+")");
                }
            }
        }
    }

    static void SumPairs2(int[] arr, int k){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++) set.add(arr[i]);

        for(int i=0; i<arr.length; i++){
            int sum = arr[i] + k;
            if(set.contains(sum)){
                System.out.println("("+arr[i] + ","+sum+")");
            }
        }
    }
}