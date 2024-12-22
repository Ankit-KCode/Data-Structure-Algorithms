public class ArrayMinMax{
    public static void main(String args[]){
        int arr[] = {23, 26, 120, 76, 41, 750, 96, 104};
        System.out.print("Largest: "+ MaxSearch(arr));
        
    }

    static int MaxSearch(int arr[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Smallest: "+ min);
        return max;
    }
}