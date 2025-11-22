public class multiply{
    public static void main(String[] args) {
        int x = -2, y = -4, z = 10;

        int temp = multiply(x, y);
        int result = multiply(temp, z);
        System.out.println(result);
    }

    // WAP to find the product of three numbers without using any multiplication operator or any function.

    static int multiply(int a, int b){
        int ans = 0;
        boolean negitive = false;

        // Handling negative numbers converting them in positive for loop (Temporary)
        if(a < 0 && b >=0){
            a = -a;
            negitive = true;
        }
        else if(a>=0 && b<0){
            b = -b;
            negitive = true;
        }
        else if(a<0 && b<0){
            a = -a;
            b = -b;

        }

        for(int i=0; i<b; i++){
            ans += a;
        }

        return (negitive==true)? -ans : ans;
    }
}