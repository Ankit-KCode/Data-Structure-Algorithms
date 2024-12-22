public class SubArray{
    public static void main(String arg[]){
        int arr[] = {2,4,6,8,10};
        SubArray(arr);
    }

    static void SubArray(int arr[]){
        int ts=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int sum=0;
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k] + " ");
                    sum=sum+arr[k];
                }
                System.out.print("----Sum:"+ sum);
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Sub Array: "+ts);
    }
}