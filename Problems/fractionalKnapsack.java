import java.util.*;
import java.util.Arrays;

public class fractionalKnapsack{
    public static void main(String[] args) {
        int[] val = {33, 14, 50, 9, 8, 11};
        int[] wt = {7, 2, 5, 9, 3, 2};
        int c = 10;

        double maxValue = fractionalKnapsack(val, wt, c);
        System.out.println("Max Value: " + maxValue);
    }

    static double fractionalKnapsack(int[] val, int[] wt, int c){
        int n = wt.length;
        Item[] items = new Item[n];

        for(int i=0; i<items.length; i++){
            items[i] = new Item(wt[i], val[i], i);

        }

        Arrays.sort(items, new Comparator<Item>(){
            @Override
            public int compare(Item o1, Item o2){
                return o2.ratio.compareTo(o1.ratio);
            }
        });

        double totalValue = 0d;

        for(Item item : items){
            int curWt = (int)item.wt;
            int curVal = (int)item.val;

            if(c - curWt >= 0){
                c = c - curWt;
                totalValue += curVal;
            }
            else{
                double fraction = (double)c/(double)curWt;
                totalValue += curVal * fraction;
                break;
            }
        }

        return totalValue;
    }

    static class Item{
        Double ratio;
        double wt, val, idx;

        public Item(int wt, int val, int idx){
            this.wt = wt;
            this.val = val;
            this.idx = idx;
            this.ratio = Double.valueOf(val/wt);
        }
    }
}