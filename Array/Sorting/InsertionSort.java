public class InsertionSort{
    public static void main(String args[]){
        int arr[] = {7, 9, 8, 10, 5, 3, 6, 2, 1, 4};
        InsertionSort(arr);
        PrintSort(arr);
    }

    static void InsertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;

            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }

            arr[prev + 1] = curr;
        }
    }

    static void PrintSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}