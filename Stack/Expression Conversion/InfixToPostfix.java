import java.util.*;

public class InfixToPostfix{
    public static void main(String args[]){
        String s = "a+b*(c^d-e)";
        String result = InfixToPostfix(s);
        System.out.println(result);
    }

    static String InfixToPostfix(String s){
        int i=0;
        Stack<Character> st = new Stack<>();
        String ans = "";
        int n = s.length();

        while(i < n){
            char ch = s.charAt(i);

            if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9')){ // Operand
                ans = ans + ch;
            }
            else if(ch == '('){ // Brackets
                st.push(ch);
            }
            else if(ch == ')'){ // Closing Brackets
                while(!st.isEmpty() && st.peek()!='('){
                    ans = ans + st.pop();
                }
                st.pop();
            }
            else{ // For Operators
                while(!st.isEmpty() && (priority(ch) <= priority(st.peek()))){
                    ans = ans + st.pop();
                }

                st.push(ch); // if it is high priority operator
            }

            i++;
        }

        // If Stack is not Empty
        while(!st.isEmpty()){
            ans += st.pop();
        }

        return ans;
    }


    // Comparing Operator Priority
    static int priority(char c){
        switch (c) {
            case '^' -> {
                return 3;
            }
            case '*', '/' -> {
                return 2;
            }
            case '+', '-' -> {
                return 1;
            }
            default -> {
            }
        }
        return -1;
    }
}