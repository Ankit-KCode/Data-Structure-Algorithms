import java.util.*;
public class RemoveDuplicates{
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        // Inplace Solving
        int k=1;
        for(int i=0, j=i+1; i<arr.length-1; i++, j++){
            if(arr[i]!=arr[j]) arr[k++] = arr[j];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Unique Array Size: "+ k);

        // Unsorted Array
        int[] arr2 = {1, 2, 3, 2, 5, 1, 6, 3, 7};
        RemoveDuplicatesUnsorted(arr2);
    }

    static void RemoveDuplicates1(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        int[] arr2 = new int[arr.length];

        for(int i=1, j=0; i<arr.length; i++){
            if(!set.contains(arr[i])) arr2[j++]=arr[i];
            set.add(arr[i]);
        }

        System.out.println(Arrays.toString(arr2));
    }

    static void RemoveDuplicatesUnsorted(int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<arr2.length; i++){
            if(!set.contains(arr2[i])) ans.add(arr2[i]);
            set.add(arr2[i]);
        }

        System.out.println(ans);
    }
}