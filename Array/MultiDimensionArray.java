import java.util.Scanner;
public class MultiDimensionArray{
    public static void main(String[]args){
        System.out.println("Enter Your Size of 2D Array(Row-Column): ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int row;
        int col;

        int[][] arr = new int[r][c];

        System.out.print("Enter Your Numbers: ");

        for(row = 0; row<r; row++){
            for(col = 0; col<c; col++){
                arr[row][col] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("Your 2D Array is: ");

        for(row = 0; row < r; row++){
            for(col = 0; col < c; col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }

        

    }
}