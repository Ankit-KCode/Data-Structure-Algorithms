import java.util.*;
public class fibo{
    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        
        System.out.println(fibo(n, dp));
        System.out.println(Arrays.toString(dp));
    }

    //Memoization
    static int fibo(int n, int[] dp){ //TC - O(n) | SC - Call Stack:O(n)+ dp:O(n)
        if(n<=1) return n; 
        if(dp[n]!=-1) return dp[n];
        return dp[n] = fibo(n-1, dp)+fibo(n-2, dp);
    }
}