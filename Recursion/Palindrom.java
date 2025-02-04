public class Palindrom{
    public static void main(String args[]){
        String s = "racar";
        int i=0;
        System.out.println(Palindrom(s, i));
    }
    static boolean Palindrom(String s, int i){
        int n = s.length();
        if(i>=n/2) return true; // Base Case
        if(s.charAt(i)!=s.charAt(n-i-1)) return false;
        else return Palindrom(s, i+1);
    }
}