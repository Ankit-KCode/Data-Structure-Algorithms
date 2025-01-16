public class FastExponentiation{
    public static void main(String args[]){
        int num = 5, pow = 10;
        System.out.println(FastExponentiation(num, pow));
    }
    private static int FastExponentiation(int num, int pow){
        int ans = 1;
        
        while(pow > 0){
            if((pow & 1) == 1){
                ans = ans * num;
            }
            num = num * num;
            pow = pow>>1;
        }
        return ans;
    }
}