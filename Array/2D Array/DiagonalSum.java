public class DiagonalSum{
    public static void main(String args[]){
        int arr[][] = {{1, 2, 3, 4}, 
                       {5, 6, 7, 8}, 
                       {9, 10, 11, 12},
                       {13, 14, 15, 16}};

        DiagonalSum(arr);

    }

    static void DiagonalSum(int arr[][]){
        int sum = 0;

        // Optimized Approach------
        for(int i=0; i<arr.length; i++){
            //Primary Sum
            sum = sum + arr[i][i];

            //Secondary Sum
            int j= arr.length-1-i;
            if(i != j){
                sum = sum + arr[i][j];
            }
        }

        //Brute Force Approach;------------------
        // for(int i=0; i<arr.length; i++){

        //     for(int j=0; j<arr[0].length; j++){
        //         // Primary Sum
        //         if(i==j){
        //             sum = sum + arr[i][j];
        //         }

        //         // Secondary Sum
        //         if(i+j == arr.length-1){
        //             sum = sum + arr[i][j];
        //         }
                
        //     }
        // }
        
        System.out.println(sum);
    }
}