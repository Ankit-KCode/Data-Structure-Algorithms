import java.util.*;
public class MergeSortedArr{

    public static void main(String args[]){
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3, n = 3;

        int end = m+n-1, i = m-1, j = n-1;

        while(i>=0 && j>=0){
            if(nums1[i] > nums2[j]) nums1[end--] = nums1[i--];
            else nums1[end--] = nums2[j--];
        }

        while(i>=0) nums1[end--] = nums1[i--];

        while(j>=0) nums1[end--] = nums2[j--];

        System.out.println(Arrays.toString(nums1));


    }
}