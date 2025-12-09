public class MissingNum{
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        MissingNum2(arr);
    }


    static void MissingNum2(int[] arr){
        int ans = 0;
        for(int num: arr) ans ^= num;

        int ans2 = 0;
        for(int i=0; i<=arr.length; i++) ans2 ^= i;

        int result = ans^ans2;
        System.out.println("Missing Num : " + result);
    }

    static void MissingNum1(int[] arr){
        int msum = 0;
        for(int num : arr) msum += num;

        int sum = 0;
        for(int i=0; i<=arr.length; i++) sum += i;

        System.out.println("Missing Num: " + (sum-msum));
    }
}