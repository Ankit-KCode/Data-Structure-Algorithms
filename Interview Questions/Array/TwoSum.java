import java.util.*;
public class TwoSum{
    public static void main(String[] args) {
        int[] nums = {2, 4, 3, 5, 6, -2, 8, 7, 1};
        int target = 6;

        TwoSum2(nums, target);
    }

    static void TwoSum1(int[] nums, int target){
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    System.out.println("("+nums[i]+","+nums[j]+")");
                }
            }
        }
    }

    static void TwoSum2(int[] nums, int target){
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            int diff = target-num;

            if(set.contains(diff)){
                System.out.println("("+num+","+diff+")");
            }
            set.add(num);
        }
    }
}