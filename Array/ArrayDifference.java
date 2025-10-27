import java.util.*;
public class ArrayDifference{
    public static void main(String[]args){
        int[] arr1 = {6, 3, 7, 5};
        int[] arr2 = {2, 1, 5, 5};
        int[] result = new int[Math.max(arr1.length, arr2.length)];


        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = result.length - 1;

        while(i>=0 && j>=0){
            result[k--] = arr1[i--] - arr2[j--];

        }

        System.out.println(Arrays.toString(result));
    }
}