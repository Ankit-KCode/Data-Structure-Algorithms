import java.util.*;
public class PostfixToInfix{
    public static void main(String args[]){
        String s = "AB-DE+F*/";
        String ans = PostfixToInfix(s);
        System.out.println(ans);
    }

    static String PostfixToInfix(String s){
        Stack<String> st = new Stack<>();
        int i = 0;
        int n = s.length();

        while(i < n){
            char ch = s.charAt(i);

            if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9'){
                st.push(String.valueOf(ch));
            }
            else{
                String st2 = st.pop();
                String st1 = st.pop();

                String merge = "(" + st1 + ch + st2 + ")";
                st.push(merge);
            }
            i++;
        }

        return st.peek();
    }
}