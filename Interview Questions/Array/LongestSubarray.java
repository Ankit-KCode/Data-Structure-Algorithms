public class LongestSubarray{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        int target = 3;
        LongestSubarrayPlus(arr, target); // Batter
        LongestSubarrayPlusOptimal(arr, target); // Optimal
    }

    static void LongestSubarrayPlusOptimal(int[] arr, int target){
        int n = arr.length;
        int len = 0;
        int sum = arr[0];
        int start = 0, end = 0;

        while(end<n){
            while(start<=end && sum>target){ // Srink
                sum -= arr[start];
                start++;
            }

            if(sum == target) len = Math.max(len, end-start+1);

            // Grow
            end++;
            if(end<n) sum += arr[end];
        }

        System.out.println("Max Length: " + len);

    }


    static void LongestSubarrayPlus(int[] arr, int target){
        int n = arr.length;
        int maxLen = 0;

        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                sum += arr[j];
                if(sum==target){
                    int len = j-i+1;
                    maxLen = Math.max(len, maxLen);
                }
                if(sum>target) break;
            }
        }

        System.out.println("Max Length: " + maxLen);
    }

}