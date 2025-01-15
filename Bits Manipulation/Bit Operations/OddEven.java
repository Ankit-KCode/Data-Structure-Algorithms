import java.util.Scanner;
public class OddEven{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int num = sc.nextInt();
        OddEven(num);
    }
    private static void OddEven(int num){

        if((num & 1) ==1){
            System.out.println("Number is Odd!");
        }
        else if((num & 1) == 0){
            System.out.println("Number is Even!");
        }
    }
}