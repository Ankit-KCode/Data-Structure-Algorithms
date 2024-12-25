public class OrderAgnosticBS{
    public static void main(String []args){

        // int arr[] = {-23,-13, 2, 6, 9, 14, 34, 45, 63, 74, 77, 84, 97, 105};
        int arr[] = {123, 110, 90, 87, 76 ,65 ,45 ,43 ,32 , 23 ,19 ,5 , 1, 0, -10};
        int target = 87;
        int ans = OrderAgnosticBS(arr, target);

        if(ans == -1){
            System.out.print("Invalid Input!!");
        }
        else{
            System.out.print("Element is at Index: "+ ans);
        }

    }

    static int OrderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1; 

        boolean isAsc = arr[start] < arr[end];


        while(start <= end){
        int mid = start + (end - start)/2;

        if(target == arr[mid]){
            return mid;
        }

        if(isAsc){
            if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }

        else{
            if(target > arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
    }

    return -1;
    }
}