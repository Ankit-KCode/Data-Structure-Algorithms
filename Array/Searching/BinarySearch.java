public class BinarySearch{
    public static void main(String []args){

        int arr[] = {-23,-13, 2, 6, 9, 14, 34, 45, 63, 74, 77, 84, 97, 105};
        int target = 105;
        int ans = B_Search(arr, target);

        if(ans == -1){
            System.out.print("Invalid Input!!");
        }
        else{
            System.out.print("Element is at index: "+ ans);
        }
    }

    static int B_Search(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }

        return -1;
    }
}