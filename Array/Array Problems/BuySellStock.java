public class BuySellStock{
    public static void main(String args[]){
        int stock[] = {1,2,3,4,5};
        System.out.print(BuySellStock(stock));
    }

    static int BuySellStock(int stock[]){
        int BuyPrice = Integer.MAX_VALUE;
        int MaxProfit = 0;


        for(int i=0; i<stock.length; i++){
            if(BuyPrice < stock[i]){
                int Profit = stock[i] - BuyPrice;
                MaxProfit = Math.max(MaxProfit, Profit);
            }
            else{
                BuyPrice = stock[i];
            }
        }
        return MaxProfit;
    }
}