import java.util.Arrays;
import java.util.Scanner;
public class ReverseArr{
    public static void main(String[]args){
        System.out.println("Enter Your Array Size: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter Your Array Elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Your Array Is: ");
        System.out.print(Arrays.toString(arr));

        //Reversing Array
        int i=0; 
        int j= n-1;
        
        while(i<j){
            int temp= arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        System.out.println("\nYour Reversed Array Is: ");
        System.out.println(Arrays.toString(arr));
    }
}