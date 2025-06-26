
import java.util.Arrays;

public class LongestConsecutiveSequence{
    public static void main(String args[]){
        int[] arr = {102, 4, 100, 1, 101, 3, 2, 1, 1, 5};
        System.out.println(bruteforce(arr));
        System.out.println(Better(arr));
    }

    static int bruteforce(int[] arr){
        int n = arr.length;
        int max = 1;

        for(int i=0; i<n; i++){
            int length = 1;
            int num = arr[i];
            while(linearSearch(arr, num+1)==true){
                num++;
                length++;
            }
            max = Math.max(max, length);
        }
        return max;
    }

    static boolean linearSearch(int[] arr, int num){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == num) return true;
        }
        return false;
    }

    static int Better(int[] arr){
        Arrays.sort(arr);
        int max = 1;
        int curr = 0;
        int lastSmall = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]-1 == lastSmall){
                curr = curr + 1;
                lastSmall = arr[i];
            }
            else if(arr[i] != lastSmall){
                curr = 1;
                lastSmall = arr[i];
            }

            max = Math.max(max, curr);
        }
        return max;
    }
}