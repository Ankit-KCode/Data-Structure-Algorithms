import java.util.Scanner;

public class arrSort{
    public static void main(String args[]){
        int i,j,n, temp;

        System.out.print("Enter Your Array Size : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int arr[]=new int[n];

        System.out.print("\nEnter Your Array Elements : ");
        for(i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("\nYour Unsorted Array : ");
        for(i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.print("\nYour Sorted Array : ");
        for(i=0; i<n; i++){
            for(j=i+1; j<n; j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}