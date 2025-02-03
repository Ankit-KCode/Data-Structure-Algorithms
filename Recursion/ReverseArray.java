public class ReverseArray{
    public static void main(String args[]){
        int arr[] = {1, 4, 3, 2, 6, 5};
        
        // int j=arr.length-1;
        // ReverseArray(arr, 0, j);
        ReverseArray(arr, 0);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    // Two Pointer
    static void ReverseArray(int arr[], int i, int j){
        if(i>=j) return;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        ReverseArray(arr, i+1, j-1);
    }

    // One Pointer
    static void ReverseArray(int arr[], int i){
        int n = arr.length-1;
        if(i>n/2) return;

        int temp = arr[i];
        arr[i] = arr[n-i];
        arr[n-i] = temp;

        ReverseArray(arr, i+1);
    }

}