import java.util.*;
public class MergeArray{
    public static void main(String[] args){
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8, 10};

        System.out.println(Arrays.toString(Merge(arr1, arr2)));
        System.out.println(Arrays.toString(MergeInPlace()));
    }

    static int[] MergeInPlace(){
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8, 10, 0, 0, 0, 0};

        int n = 4, m = 5;
        int i=n-1, j=m-1, k=arr2.length-1;

        while(i>=0 && j>=0){
            if(arr1[i]>=arr2[j]) arr2[k--] = arr1[i--];
            else arr2[k--] = arr2[j--];
        }

        while(i>=0){
            arr2[k--] = arr1[i--];
        }
        while(j>=0){
            arr2[k--] = arr2[j--];
        }

        return arr2;
    }

    static int[] Merge(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int[] ans = new int[n+m];

        int i=0;
        int j=0;
        int k=0;

        while(i<n && j<m){
            if(arr1[i]<=arr2[j]) ans[k++] = arr1[i++];
            else ans[k++] = arr2[j++];
        }

        while(i<n){
            ans[k++] = arr1[i++];
        }
        while(j<m){
            ans[k++] = arr2[j++];
        }

        return ans;
    }
}