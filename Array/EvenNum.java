// LeetCode Question

public class EvenNum{
    public static void main(String[]args){

        int[] nums = {12, 345, 2, 6, 7896, 1234, 654, 9856};

        int result = findNum(nums);
        System.out.print("Even Num Digits Count: "+ result);
    }

    static int findNum(int[] nums){
        int count = 0;

        for(int i=0; i<nums.length; i++){
            int e = Digit(nums[i]);
            if(e%2 == 0){
                count++;
            }
        }
        return count;
    }

    static int Digit(int n){

        int c = 0;
        while(n>0){
            c++;
            n = n/10;
        }
        return c;
    }

}