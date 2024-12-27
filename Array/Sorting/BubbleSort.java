public class BubbleSort{
    public static void main(String args[]){
        int arr[] = {5, 8, 2, 4, 1, 5};
        BubbleSort(arr);
        PrintSort(arr);
    }

    static void BubbleSort(int arr[]){
        for(int tern=0; tern< arr.length; tern++){
            for(int j=0; j< arr.length - 1 - tern; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    static void PrintSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
