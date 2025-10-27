import java.util.*;
public class ArrayElementInsert{
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        int curSize = 5;

        System.out.println("Enter Position for element insertion: ");
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();

        System.out.println("Enter Your Element: ");
        int val = sc.nextInt();

        for(int i=curSize-1; i>=pos-1; i--){
            arr[i+1] = arr[i];
        }

        arr[pos-1] = val;
        curSize++;

        System.out.println(Arrays.toString(arr));
    }
}