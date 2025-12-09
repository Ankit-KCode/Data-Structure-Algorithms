public class DivisorCountPrime{
    public static void main(String[] args) {
        // Given a number n find if its divisors count from 1 to n (inclusive) is prime or not. Explain
        int n = 10;

        int divCount = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0) divCount++;
        }

        if(checkPrime(divCount)) System.out.println("Is Prime!");
        else System.out.println("Not Prime!");

    }

    static boolean checkPrime(int num){
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i==0) return false;
        }
        return true;
    }
}