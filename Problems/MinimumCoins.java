
import java.util.Arrays;

public class MinimumCoins{
    public static void main(String args[]){
        int[] coins = {1, 2, 5};
        int amount = 11;
        int ans = MinimumCoins(coins, amount);
        System.out.println(ans);
    }

    static int MinimumCoins(int[] coins, int amount){
        Arrays.sort(coins);

        int i=coins.length-1; 
        int count = 0;

        while(i>=0){
            if(amount >= coins[i]){
                count++;
                amount -= coins[i];
            }
            else{
                i--;
            }
        }

        if(amount > 0) return -1;

        return count;
    }
}