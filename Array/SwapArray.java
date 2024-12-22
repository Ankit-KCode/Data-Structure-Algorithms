import java.util.Arrays;

public class SwapArray{
    public static void main(String[]args){
        int[] arr = {1,2,3,4,5,6,7,8};
        swap(arr, 0, 7);
        System.out.print(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}