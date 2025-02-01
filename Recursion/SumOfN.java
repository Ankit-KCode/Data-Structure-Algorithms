public class SumOfN{
    public static void main(String args[]){
        int n = 5;
        // SumOfN(n, 0);
        System.out.println(SumOfN(n));
    }

    static void SumOfN(int n, int sum){
        if(n<1){
            System.out.println(sum);
            return;
        }
        SumOfN(n-1, sum+(n*n*n));
    }

    static int SumOfN(int n){
        if(n==1) return 1;
        return n*n*n + SumOfN(n-1);
    }
}