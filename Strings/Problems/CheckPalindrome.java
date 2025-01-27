public class CheckPalindrome{
    public static void main(String[] args) {
        String input = "wobw";
        System.out.println(CheckPalindrome(input));
    }


    static boolean CheckPalindrome(String input){
        int n = input.length();
        int j=0;
        
        for(int i=n-1; i>=n/2; i--){
            if(input.charAt(j)!=input.charAt(i)){
                return false;
            }
            j++;
        }

        return true;
    }

    // static boolean CheckPalindrome(String input){
    //     StringBuilder sb = new StringBuilder(input);

    //     return input.equalsIgnoreCase(sb.reverse().toString());
    //     // return input.equalsIgnoreCase(new StringBuilder(input).reverse().toString());  //Direct Method.
    // }
}