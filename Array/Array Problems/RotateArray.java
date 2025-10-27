
import java.util.Arrays;

public class RotateArray{
    public static void main(String args[]){
        int nums[] = {-1,-100, 3, 99};
        int n = nums.length;
        int k = 2;
        if(k>n) k=k%n;

        reverse(0, n-1, nums); // {99, 3, -100, -1}
        reverse(0, k-1, nums); // {3, 99, -100, -1}
        reverse(k, n-1, nums); // {3, 99, -1, -100}

        System.out.println(Arrays.toString(nums));
    }

    static void reverse(int start, int end, int nums[]){

        int i= start;
        int j = end;
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}