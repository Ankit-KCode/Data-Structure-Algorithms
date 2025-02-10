import java.util.Arrays;
public class Selection_Sort{
    public static void main(String args[]){
        int arr[] = {13, 46, 46, 24, 52, 20, 9};

        // Selection Sort : Select Min & Swap:
        for(int i=0; i<arr.length-1; i++){

            int minIdx = i;
            for(int j=i; j<arr.length; j++){
                if(arr[j]<arr[minIdx]){
                    minIdx = j;
                }
            }

            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}