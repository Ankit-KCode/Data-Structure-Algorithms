import java.util.*;
public class LongestConsecutive{
    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2, 91, 92, 93, 94, 95, 96, 97, 98};
        System.out.println(LongestConsecutive(arr));
    }

    static int LongestConsecutive(int[] arr){
        Arrays.sort(arr); // 1, 2, 3, 4, 100, 200

        int ans = 1; 
        int currLen = 1;

        for(int i=0; i<arr.length-1; i++){
            if(arr[i+1]==arr[i]+1) currLen++;
            else {
                ans = Math.max(ans, currLen);
                currLen = 1;
            }
        }

        return ans;
    }

    // static int LongestConsecutive2(int[] arr){
    //     HashSet<Integer> set = new HashSet<>();

    //     int min
    //     for(int num : arr){
    //         set.add(num);

    //     }
    // }
}