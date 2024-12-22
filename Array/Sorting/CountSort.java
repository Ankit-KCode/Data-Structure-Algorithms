public class CountSort{
    public static void main(String []args){
        int arr[] = {1, 4, 2, 1, 4, 3, 7};
        CountSort(arr);
        PrintSort(arr);
    }

    static void CountSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        // Counting frequency of number at same position as number.
        int freqCount[] = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            freqCount[arr[i]]++;
        }
        // Printing Frequency Array.
        System.out.println("Frequency Count Array");
        for(int i=0; i<freqCount.length; i++){
            System.out.print(freqCount[i] + " ");
        }

        System.out.println();
        System.out.println("Sorted Array");


        // Sorting the array according to Frequency Count.
        int j = 0;
        for(int i=0; i<freqCount.length; i++){
            while(freqCount[i] > 0){
                arr[j] = i;
                j++;
                freqCount[i]--;
            }
        }
    }

    static void PrintSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}