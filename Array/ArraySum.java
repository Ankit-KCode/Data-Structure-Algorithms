public class ArraySum{
    public static void main(String []args){
        int[] arr1 = {2, 3, 7, 5, 8, 4};
        int[] arr2 = {6, 1, 5, 5};
        int[] result  = new int[Math.max(arr1.length,arr2.length)];
        

        int i = arr1.length -1;
        int j = arr2.length -1;
        int k = result.length - 1;
        int crr = 0;

        //For Example: {2,5,7,2,7}
        //             {5,8,2,9,5}
        while(i>=0 && j>=0){
            int sum = arr1[i] + arr2[j] + crr;
            result[k] = sum%10;
            crr = sum/10;

            i--;
            j--;
            k--;
        }

        //For Example: {2,5,7,2,7,4,9,2}
        //             {5,8,2,9,5}
        while(i>=0){
            int sum = arr1[i] + crr;
            result[k] = sum%10;
            crr = sum/10;
            i--;
            k--;
        }

        //For Example: {2,5,7,2,7}
        //             {5,8,2,9,5,4,1,7}
        while(j>=0){
            int sum = arr2[j] + crr;
            result[k] = sum%10;
            crr = sum/10;

            j--;
            k--;
        }

        for(k=0; k<result.length; k++){
            System.out.print(result[k] + " ");
        }
        
    }

    // static int[] Sum(int[] arr1, int[] arr2, int[] result){
    //     int i = arr1.length -1;
    //     int j = arr2.length -1;
    //     int k = result.length - 1;
    //     int crr = 0;

    //     while(i<=0 && j<=0){
    //         int sum = arr1[i] + arr2[j] + crr;
    //         result[k] = sum%10;
    //         crr = sum/10;

    //         i--;
    //         j--;
    //         k--;
    //     }
    //     return result;

    // }

}
