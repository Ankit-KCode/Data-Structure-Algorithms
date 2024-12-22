import java.util.Scanner;
public class ArrayInsertion{
    public static void main(String args[]){
        int arr[] = {23, 54, 65, 24, 60, 88, 99};

        System.out.println("Enter Your Element Position:");
        Scanner sc = new Scanner(System.in);
        int position = sc.nextInt();

        System.out.println("Enter Your Element");
        int element = sc.nextInt();

        Insert(arr, position, element);
        
    }
    
    static void Insert(int arr[], int position, int element){
        
        for(int i=arr.length-1; i>=position; i--){
            arr[i]=arr[i-1];
        }
        arr[position] = element;

        for(int i=0; i<arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }
    }
}