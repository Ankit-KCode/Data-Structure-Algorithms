public class FindFactorial{
    public static void main(String[] args) {
        int num = 5;
        int ans = 1;
        
        // Iterative
        for(int i=num; i>=1; i--){
            ans = ans*i;
        }

        System.out.println(fact(num));
    }
         
    // Recursive
    static int fact(int num){
        if(num == 0) return 1;

        return num* fact(num-1);
    }
}