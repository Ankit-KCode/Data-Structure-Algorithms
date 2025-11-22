public class MaxSubArrLen{
    public static void main(String args[]){
        int[] arr = {10, 9, 8, 7, 3, 2, 1, 5, 4};

        System.out.println(maxLengthOptimal(arr));

    }

    // Find maximum length of subarray in such a way where arr[i]- arr[i+1]=1.
    
    static int maxLengthOptimal(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0;

        int maxLen = 1, currLen = 1;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] - arr[i + 1] == 1) {
                currLen++;
                maxLen = Math.max(maxLen, currLen);
            } else {
                currLen = 1; // reset
            }
        }
        return maxLen;
    }

    // static int MaxSubArrLen(int[] arr){
    //     int Maxlen = 1;
    //     int n = arr.length;

    //     for(int i=0; i<n; i++){
    //         int length = 1;
    //         for(int j=i; j<n-1; j++){
    //             if(arr[j]-arr[j+1] == 1){
    //                 length++;
    //                 Maxlen = Math.max(Maxlen, length);
    //             }
    //             else{
    //                 break;
    //             }
    //         }
    //     }

    //     return Maxlen;
    // }

}