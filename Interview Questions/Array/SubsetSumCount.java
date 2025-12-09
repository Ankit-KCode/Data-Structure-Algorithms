public class SubsetSumCount{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int target = 3;

        System.out.println(SubsetSumCount(arr, target));

    }

    static int SubsetSumCount(int[] arr, int target){
        int n = arr.length;
        int ans = 0;

        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                sum += arr[j];
            }
            if(sum==target) ans++;
        }

        return ans;
    }
}