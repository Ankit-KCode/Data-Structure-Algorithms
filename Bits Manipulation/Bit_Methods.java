public class Bit_Methods{
    public static void main(String args[]){
        int num1 = 15;

        //Count Set Bits (1's) in any Number
        int setBits = Integer.bitCount(num1);
        System.out.println("Set Bits in Num1: " + setBits);
    }
}