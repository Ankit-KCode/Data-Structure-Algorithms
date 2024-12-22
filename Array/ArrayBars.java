public class ArrayBars{
    public static void main(String []args){
        int [] arr = {2, 5, 7, 0, 8, 1};
        
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        for(int up = max; up >= 1; up--){
            for(int i=0; i<arr.length; i++){
                if(arr[i] >= up){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
}
}