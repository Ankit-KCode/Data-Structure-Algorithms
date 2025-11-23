import java.util.*;
public class AbsoluteDiff{
    public static void main(String[] args) {
        int[] arr = {4, 10, 1, 2, 9, 8};
        int n = arr.length;

        Arrays.sort(arr); // Sorting the Array
        int[] rearr = new int[n];

        int left=0, right=n-1, idx=0;

        while(left<=right){ // Rearranging in [Small,Large,Small,Large....] Manner.
            if(idx<n) rearr[idx++] = arr[left++]; //Small
            if(idx<n) rearr[idx++] = arr[right--]; //Large
        }

        int sum = 0;
        for(int i=1; i<n; i++){ // Summing Absolute Difference + Circular Diff. - For Max Sum
            sum += Math.abs(rearr[i-1]-rearr[i]);
            if(i==n-1) sum += Math.abs(rearr[i]-rearr[0]);
        }

        System.out.println(sum);
    }
}