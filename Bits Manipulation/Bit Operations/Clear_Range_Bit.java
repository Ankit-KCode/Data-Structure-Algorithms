public class Clear_Range_Bit{
    public static void main(String args[]){
        int num = 15;
        int i = 1;
        int j = 2;

        System.out.println(Clear_Range_Bit(num, i, j));
    }
    static int Clear_Range_Bit(int num, int i, int j){
        int a = ~(0)<<(j+1);
        int b = (1<<i)-1;

        int bitmask = a | b;

        return num & bitmask;
    }
}