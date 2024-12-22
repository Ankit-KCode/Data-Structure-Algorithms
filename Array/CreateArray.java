import java.util.Arrays;
import java.util.Scanner;
public class CreateArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Array Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter The Elements of the array: ");
        

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Your Array Elements Are: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("2nd Method to print Array:");
        System.out.print(Arrays.toString(arr));
    

        String[] str = new String[n];

        for(int i=0; i<str.length; i++){
            str[i] = sc.next();
        }

        System.out.print(Arrays.toString(str));
}
}