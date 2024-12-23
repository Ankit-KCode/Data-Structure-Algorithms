import java.util.Scanner;

public class LinearSearch{
    public static void main(String[]args){
        
        System.out.println("Enter the size of Array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter Your Array Elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter Your Element To Be Searched: ");
        int x = sc.nextInt();

        int result = LinearSearch(arr,x);

        if(result == -1){
            System.out.print("Element Not Found!");
        }
        else if(result == -2){
            System.out.print("No elements in Array!");
        }
        else{
            System.out.print("Your Element is at Index: "+ result);
        }
    }

    static int LinearSearch(int[] arr, int x){
        if(arr.length == 0){
            return -2;
        }

        for(int i=0; i<arr.length; i++){
            int e = arr[i];
            if(e == x){
                return i;
            }
        }

        return -1;

    }
}
