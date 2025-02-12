import java.util.Arrays;
public class QuickSort{
    public static void main(String args[]){
        int arr[] = {1, 3, 3, 1, 2, 4, 1, 2, 5, 6, 2, 4};
        int low = 0;
        int high = arr.length-1;
        QuickSort(arr, low, high);
        System.out.println(Arrays.toString(arr));
    }

    static void QuickSort(int arr[], int low, int high){
        if(low<high){
            int pidx = pivot(arr, low, high);
            QuickSort(arr, low, pidx-1);
            QuickSort(arr, pidx+1, high);
        }
    }

    // inserting pivot element at right position & returning pivot index.
    static int pivot(int arr[], int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;

        while(i<j){
            while(arr[i] <= pivot && i <= high-1) i++;
            while(arr[j] > pivot && j >= low+1) j--;
            if(i<j) swap(arr, i, j);
        }
        swap(arr, low, j);
        return j;
    }

    
    static void swap(int arr[], int a, int b){
        int temp = arr[a]; 
        arr[a] = arr[b];
        arr[b] = temp;
    }
}