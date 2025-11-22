import java.util.*;
public class QuickSort{
    public static void main(String[] args) {
        int[] arr = {50, 60, 30, 10, 40, 20, 70, 80};
        int low = 0; 
        int high = arr.length-1;
        QuickSort(arr, low, high);
        System.out.println(Arrays.toString(arr));

    }

    static void QuickSort(int[] arr, int low, int high){

        if(low<high){
            int pivot = partition(arr, low, high);
            QuickSort(arr, low, pivot-1);
            QuickSort(arr, pivot+1, high);
        }
    }

    static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int left = low+1;
        int right = high;

        while(left<=right){
            while(left<=right && arr[left]<=pivot) left++;
            while(left<=right && arr[right]>pivot) right--;
            if(left<right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        int temp = arr[low];
        arr[low] = arr[right];
        arr[right] = temp;

        return right;
    }
}