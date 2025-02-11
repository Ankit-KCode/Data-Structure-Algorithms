import java.util.*;
public class MergeSort{
    public static void main(String args[]){
        int arr[] = {3, 3, 1, 2, 4, 1, 2, 5, 6, 2, 4};
        int low = 0;
        int high = arr.length-1;

        MergeSort(arr, low, high);
        System.out.println(Arrays.toString(arr));
    }

    static void MergeSort(int arr[], int low, int high){
        if(low == high) return;
        int mid = (low + high)/2;
        MergeSort(arr, low, mid);
        MergeSort(arr, mid+1, high);
        merge(arr, mid, low, high);
    }

    static void merge(int arr[], int mid, int low, int high){
        int ans[] = new int[high - low + 1];
        int left = low;
        int right = mid+1;
        int x = 0;
        while(left <= mid && right <= high){
            if(arr[left]<=arr[right]){
                ans[x++] = arr[left++];
            }
            else{
                ans[x++] = arr[right++];
            }
        }

        while(left <= mid){
            ans[x++] = arr[left++];
        }

        while(right <= high){
            ans[x++] = arr[right++];
        }

        for(int i=0, j=low; i<ans.length; i++, j++){
            arr[j] = ans[i];
        }
    }
}