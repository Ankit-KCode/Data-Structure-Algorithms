public class ArmstrongNum{
    public static void main(String[] args) {
        int num = 154;

        String str = String.valueOf(num);
        int n = str.length();

        int sum = 0;

        int val = num;
        while(val>0){
            int digit = val%10;
            sum += Math.pow(digit, n);
            val = val/10;
        }

        if(sum == num) System.out.println("Yes Armstrong!");
        else System.out.println("No");
    }
}