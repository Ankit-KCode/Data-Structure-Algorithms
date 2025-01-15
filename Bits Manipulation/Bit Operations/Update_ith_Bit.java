public class Update_ith_Bit{
    public static void main(String args[]){
        int num = 10;
        int pos = 1;
        int newBit = 0;

        if(newBit == 0){
            System.out.println(Clear_ith_bit(num, pos));
        }
        else{
            System.out.println(Set_ith_Bit(num, pos));
        }

        //Optimise Approach
        num = Clear_ith_bit(num, pos);
        int bitmask = newBit<<pos;
        int ans = num | bitmask;
        System.out.println(ans);

    }

    static int Set_ith_Bit(int num, int pos){
        int bitmask = 1<<pos;
        return num | bitmask;
    }
    static int Clear_ith_bit(int num, int pos){
        int bitmask = ~(1<<pos);
        return num & bitmask;
    }
}