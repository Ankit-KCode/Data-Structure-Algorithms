import java.util.Arrays;

public class PrefixSum{
    public static void main(String args[]){
        int arr[] = {2, 4, 6, 8, 10};
        int PrefixSum[] = calculatePrefixSum(arr);

        // Print Prefix Sum
        System.out.println(Arrays.toString(PrefixSum));

        //Finding Sum of Specific Sub Array (L - R index)
        int L = 1, R = 3;

        int SubSum = PrefixSum[R] - PrefixSum[L-1];
        System.out.println("SubArray Sum Between L and R: "+SubSum);
    }

    static int[] calculatePrefixSum(int [] arr){
        int n = arr.length;
        int[] PrefixSum = new int[n];

        PrefixSum[0] = arr[0];

        for(int i=1; i<n; i++){
            PrefixSum[i] = PrefixSum[i-1] + arr[i];
        }

        return PrefixSum;
    }
}