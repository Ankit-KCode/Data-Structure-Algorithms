
import java.util.Scanner;

public class twoDArray{
    public static void main(String args[]){
        int arr[][] = new int[4][4];

        System.out.println("Enter the Elements of 2D Array:");

        Scanner sc = new Scanner(System.in);

        for(int row=0; row < arr.length; row++){
            for(int col=0; col < arr.length; col++){
                arr[row][col] = sc.nextInt();
            }
            System.out.println();
        }

        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr.length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        System.out.print("Enter Your Element to be Search: ");
        int s = sc.nextInt();
        Search(arr, s);
    }

    static void Search(int arr[][], int s){

        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr.length; col++){
                if(arr[row][col] == s){
                    System.out.print("Element found at Index: (" + row + "," + col + ")");
                }
            }
        }
    }
}