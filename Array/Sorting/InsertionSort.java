import java.util.*;
public class InsertionSort{
    public static void main(String args[]){
        int arr[] = {7, 9, 8, 10, 10, 5, 3, 6, 2, 1, 4};
        InsertionSort(arr);
    }

    static void InsertionSort(int arr[]){
        for(int i=0; i<arr.length; i++){

            int j = i;
            while(j > 0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}