public class Clear_ith_bit{
    public static void main(String args[]){
        int num = 10;
        int i = 1;

        System.out.println(Clear_ith_bit(num, i));
    }

    static int Clear_ith_bit(int num, int i){
        // int bitmask = 1<<i;
        // return num ^ bitmask; //It works in some cases but not for all.

        int bitmask = ~(1<<i);
        return num & bitmask;
    }
}