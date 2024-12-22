public class ArrayMax{
    public static void main(String[]args){
        int[] arr = {23,43,24,56,76,30};
        System.out.print("Array Max Is: "+ max(arr));

    }

    static int max(int[] arr){
        int maxval= arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i]>maxval){
                maxval=arr[i];
            }
        }
        return maxval;
    }
}