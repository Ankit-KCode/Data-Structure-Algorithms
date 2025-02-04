public class IntOccuranceCount_HashArray{
    public static void main(String args[]){
        int arr[] = {1, 2, 1, 3, 4, 3, 2, 1, 4, 7, 7, 6, 8};
        int n = 1;
        // Basic : Using Hash Array
        int hash[] = new int[13];
        for(int i=0; i<arr.length; i++){
            hash[arr[i]]++;
        }

        System.out.println(hash[n]);
        

    }
}