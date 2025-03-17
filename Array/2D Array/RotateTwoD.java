public class RotateTwoD{
    public static void main(String args[]){
        int arr[][] = {{1, 2, 3}, 
                       {4, 5, 6}, 
                       {7, 8, 9}};

        System.out.println("Brute Force--");
        rotate(arr);
        System.out.println("Optimized Solution--");
        RotateTwoD(arr);

    }

    // Brute Force 
    static void rotate(int arr[][]){
        int n = arr.length;
        int ans[][] = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                ans[j][n-i-1] = arr[i][j];
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }



    static void RotateTwoD(int arr[][]){
        int n = arr.length;
        
        // Transpose Matrix
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(i!=j){
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }

        //Reverse Matrix Array
        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][n-1-j];
                arr[i][n-1-j] = temp;
            }
        }

        //Printing Rotated Matrix
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}