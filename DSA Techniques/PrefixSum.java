import java.util.Arrays;
public class PrefixSum{
    public static void main(String args[]){
        int arr[] = {2, 4, 1, 6, 8};
        PrefixSum(arr);
    }

    static void PrefixSum(int arr[]){
        int n = arr.length;
        int pre[] = new int[n];

        //Optimized Approach;
        pre[0]=arr[0];
        for(int i=1; i<n; i++){
            pre[i] = pre[i-1] + arr[i];
        }


        // int sum = 0;
        // for(int i=0; i<n; i++){
        //     sum += arr[i];
        //     pre[i] = sum;
        // }
        System.out.println(Arrays.toString(pre));
    }
}