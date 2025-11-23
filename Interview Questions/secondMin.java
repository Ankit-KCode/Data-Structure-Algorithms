public class secondMin{
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3, 1};

        System.out.println(secondMin(arr));
    }

    // Find the second minimum in the array in one traversal of the array.

    static int secondMin(int[] arr){
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] < min1){
                min2 = min1;
                min1 = arr[i];
            }
            else if(arr[i] > min1 && arr[i] < min2){
                min2 = arr[i];
            }
        }

        return min2;
    }
}