import java.util.Scanner;

public class MultiArr{
    public static void main(String[]args){
        System.out.print("Enter Your row Size: ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        System.out.print("Enter Your Col Size: ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        System.out.print("Enter Your Elements: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j]= sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("Your 2D Array is: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.print("Enter Your Element To Be Searched: ");
        int e = sc.nextInt();

        System.out.print("Your Element is at Index: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(arr[i][j] == e){
                    System.out.print(i+","+j);
                }
            }
        }
    }
}