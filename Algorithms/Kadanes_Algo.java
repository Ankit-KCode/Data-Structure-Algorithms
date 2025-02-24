public class Kadanes_Algo{
    public static void main(String args[]){
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Max Sub Array Sum : " + MaximumSumSubArray(nums));
    }

    // Kadane's Algorithm is used to find the largest SubArray Sum in O(n);
    static int MaximumSumSubArray(int nums[]){

        int max = Integer.MIN_VALUE;
        int currSum = 0;

        for(int num : nums){
            currSum += num;
            if(currSum > max) max = currSum;
            if(currSum < 0) currSum = 0;    // Reset if Negative
        }

        return max;
    }
}