public class nextPelindrom{
    public static void main(String[] args) {
        int n = 1110;
        int num = n+1;

        while(!checkPelindrom(num)){
            num++;
        }

        System.out.println(num);
    }
    
    static boolean checkPelindrom(int num){
        int rev = 0;
        int val = num;

        while(val>0){
            int digit = val%10;
            rev = rev*10+digit;
            val = val/10;
        }

        return rev==num;
    }
}