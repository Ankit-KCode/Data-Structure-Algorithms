public class Bits_Basics{
    public static void main(String args[]){
        // 5 = 0101,   3 = 0011;
        int a = 5, b = 3;

        // AND Operator
        int x = a & b; // 0001 = 1;
        System.out.println("AND : " + x);

        // OR Operator
        int y = a | b; // 0111 = 7;
        System.out.println("OR : " + y);

        // XOR Operator
        int z = a ^ b; // 0110 = 6;
        System.out.println("XOR : " + z);

        // NOT Operator
         // a = 5 -- Binary: 00000000 00000000 00000000 00000101
        int notA = ~a; 
         // Flips all bits: 11111111 11111111 11111111 11111010 
         // 2's Complement : (flip again and Add +1)
        System.out.println("NOT a: " + notA); // -6

        
    }
}