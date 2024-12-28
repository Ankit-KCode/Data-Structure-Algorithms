import java.util.Arrays;
public class OccuranceDifference{
    public static void main(String args[]){
        int arr[]= {7, 8, 4, 5, 4, 1, 1, 7, 7, 2, 5};
        
        // Sorted the Array and Find out the length of Unique Elements in Array.
        Arrays.sort(arr);
        int nCount = 1;
        System.out.println(Arrays.toString(arr));

        for(int i=1; i<arr.length; i++){
            if(arr[i]!=arr[i-1]){
                nCount++;
            }
        }
        // Created Count Array and Count the Occurance in in countArr[] from 0.
        int countArr[] = new int[nCount]; 
        int c = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]==arr[i-1]){
                countArr[c]++;
            }
            else{
                c++;
            }
        }
        System.out.println(Arrays.toString(countArr));

        // Finding Max and Min Occurance Value.
        int min = countArr[0];
        int max = countArr[0];
        
        for(int i=0; i<countArr.length; i++){
            if(max<countArr[i]){
                max = countArr[i];
            }
            if(min>countArr[i]){
                min = countArr[i];
            }
        }
        
        System.out.println("Difference between highest and lowest occurrence: "+ (max-min));

    }

}
