public class SelectionSort{
    public static void main(String args[]){
        int arr[] = {5, 6, 2, 1, 9, 3};
        SelectionSort(arr);
        PrintSort(arr);
    }

    static void SelectionSort(int arr[]){

        for(int i=0; i<arr.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[minPos]){
                   minPos = j;
                }
            }

            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    static void PrintSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.err.print( arr[i] +" ");
        }
    }
}