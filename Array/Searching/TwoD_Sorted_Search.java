public class TwoD_Sorted_Search{
    public static void main(String args[]){
        int matrix[][] = {{10, 20, 30, 40},
                          {15, 25, 35, 45},
                          {27, 29, 37, 48},
                          {32, 33, 39, 50}};
        int target = 50;
        TwoD_Sorted_Search(matrix, target);
        //Time Complexity : O(row+Col)
    }

    static boolean TwoD_Sorted_Search(int matrix[][], int target){

        int row = 0; 
        int col = matrix[0].length-1;

        while(row<matrix.length && col>=0){
            if(matrix[row][col]==target){
                System.out.println("Search Found at Index: ("+ row +","+ col+ ")");
                return true;
            }
            else if(target < matrix[row][col]){
                // if target is smaller than the current element. move downside (reduce column)
                col--;
            }
            else{
                // if target is greater than the current element. move left side (add row)
                row++;
            }
        }

        System.out.println("Search Not Found!");
        return false;
    }
}