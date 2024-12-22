import java.util.Scanner;

public class revArray{
    public static void main(String []args){

        int n , i;
        System.out.print("Enter Your Array Size : ");
        Scanner r = new Scanner(System.in);
        n=r.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Array Elements : ");
        for(i=0; i<n; i++){
            arr[i]=r.nextInt();
        }

        System.out.println("Your Array Is : ");
        for(i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        //Only Printing Reverse of array.
        System.out.println("Reverse Of Your Array Is : ");
        for(i=n-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }

    }
}