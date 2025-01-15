public class Clear_Last_ith_Bit{
    public static void main(String args[]){
        int num = 13;
        int i = 2;
        System.out.println(Clear_Last_ith_Bit(num, i));
    }
    static int Clear_Last_ith_Bit(int num, int i){
        int bitmask = ~(0)<<i; // ~(0) = 111111 (not of 000000)

        return num & bitmask;
    }
}