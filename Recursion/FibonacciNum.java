public class FibonacciNum{
    public static void main(String args[]){
        long num = 6;
        System.out.println(fibo(num));
    }

    static long fibo(long num){
        if(num<=1) return num;
        return fibo(num-1) + fibo(num-2);
    }
}