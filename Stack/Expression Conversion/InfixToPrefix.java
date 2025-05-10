import java.util.*;
public class InfixToPrefix{
    public static void main(String args[]){
        // String s = "a+b*(c^d-e)";
        String s = "(a+b)*c-d+f";
        String revString = reverse(s); // Reversing the expression
        String ans = InfixToPostfix(revString); // infix to posfix
        ans = reverse(ans); // reversing postfix

        System.out.println(ans);
        // System.out.println(revString);
    }

    static String InfixToPostfix(String revString){
        Stack<Character> st = new Stack<>();
        String result = "";
        int n = revString.length();
        int i=0;

        while(i < n){
            char ch = revString.charAt(i);

            if(ch>='A' && ch<='Z' || ch>='a' && ch<='z' || ch>='0' && ch<='9'){
                result += ch;
            }
            else if(ch == '(') st.push(ch);
            else if(ch == ')'){
                while(!st.isEmpty() && st.peek()!='('){
                    result += st.pop();
                }
                st.pop();
            }
            else{
                if(ch=='^'){
                    while(!st.isEmpty() && priority(ch) <= priority(st.peek())){
                        result += st.pop();
                    }
                }
                else{
                    while(!st.isEmpty() && priority(ch) < priority(st.peek())){
                        result += st.pop();
                    }

                }
                st.push(ch);
            }
            i++;
        }

        while(!st.isEmpty()){
            result += st.pop();
        }

        
        return result;
    }


    static int priority(char ch){
        switch(ch){
            case '^' -> {
                return 3;
            }
            case '*', '/' -> {
                return 2;
            }
            case '+', '-' -> {
                return 1;
            }
            default ->{

            }
        }

        return -1;
    }
     
    
    static String reverse(String s){
        String revString = "";

        for(int i=s.length()-1; i>=0; i--){
            char ch = s.charAt(i);
            switch (ch) {
                case '(':
                    revString += ')';
                    break;
                case ')':
                    revString += '(';
                    break;
                default:
                    revString += ch;
                    break;
            }
        }

        return revString;
    }
}