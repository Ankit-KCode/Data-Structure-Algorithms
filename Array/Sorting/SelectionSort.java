public class SelectionSort{
    public static void main(String args[]){
        int arr[] = {4, 3, 5, 1, 2, 6, 9, 8};
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

    // static void selection(int arr[]){
        
    //     for(int i=0; i<arr.length; i++){
            
            
    //         int min_idx = i;
    //         for(int j=i; j<arr.length; j++){
    //             if(arr[j]<arr[min_idx]){
    //                 min_idx = j;
    //             }
    //         }
    //         int temp = arr[min_idx];
    //         arr[min_idx] = arr[i];
    //         arr[i] = temp;
    //     }

    //     System.out.print(Arrays.toString(arr));
    // }
}