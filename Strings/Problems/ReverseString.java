public class ReverseString{
    public static void main(String args[]){
        String s = "HELLO WORLD";
        System.out.println(ReverseString(s));
    }

    static String ReverseString(String s){
        
        StringBuilder sb = new StringBuilder("");
        String r = "";
        int n=s.length();
        
        for(int i=n-1; i>=0; i--){
            String ch = String.valueOf(s.charAt(i));
            if(r.contains(ch) || s.charAt(i)==' '){
                continue;
            }
            else{
                sb.append(s.charAt(i));
                r=r+s.charAt(i);
            }
        }
        
        return sb.toString();
    }
}