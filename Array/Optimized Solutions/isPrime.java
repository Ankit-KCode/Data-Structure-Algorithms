public class isPrime{
    public static void main(String args[]){
        System.out.print("Prime: " + isPrime(31));
    }

    static boolean isPrime(int n){
        //Corner Case
        if(n == 2){
            return true;
        }

        // for(int i = 2; i<=n-1; i++){
        //     if(n%i == 0){
        //         return false;
        //     }
        // }

        //Optimize Method
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }

        return true;
    }
}