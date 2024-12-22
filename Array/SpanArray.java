import java.util.Scanner;
public class SpanArray{
    public static void main(String []args){
        System.out.print("Enter Your Size: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter Your Array Elements: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int max = max(arr);
        int min = min(arr);

        int span = max - min;
        System.out.print("\n Span of Array: "+ span);
    }

    static int max(int[] arr){
        int m = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]>m){
                m = arr[i];
            }
        }
        return m;
    }

    static int min(int[]arr){
        int l = arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i]<l){
                l = arr[i];
            }
        }
        return l;
    }
}