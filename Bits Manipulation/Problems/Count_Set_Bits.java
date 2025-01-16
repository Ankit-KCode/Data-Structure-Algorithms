public class Count_Set_Bits{
    public static void main(String args[]){
        int num = 7;
        System.out.println("Set Count: "+ Count_Set_Bits(num));
        //Time Complexity : O(logN)

    }
    private static int Count_Set_Bits(int num){
        int count = 0;

        while(num!=0){
            if((num & 1) == 1){
                count++;
            }
            num = num>>1;
        }
        return count;
    }

}