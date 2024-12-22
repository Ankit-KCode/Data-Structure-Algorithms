public class ArrayMin{
    public static void main(String[] args){

        int[] arr = {34,65,75,98,23,54};
        int result= min(arr);
        System.out.print("Min is: "+ result);
    }

    static int min(int arr[]){
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
            
        }
        return min;
    }
}