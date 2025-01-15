public class Set_ith_Bit{
    public static void main(String args[]){
        int num = 10; //To changes in bit : OR is used.
        int i = 2;
        System.out.println(Set_ith_Bit(num, i));
    }

    static int Set_ith_Bit(int num, int i){
        int bitmask = 1<<i;

        return num | bitmask;
    }
}