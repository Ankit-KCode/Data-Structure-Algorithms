import java.util.*;
public class FactorialList{
    public static void main(String args[]){
        long n = 54;
        ArrayList<Long> ans = new ArrayList<>();
        long fact = 1;
        long i = 1;
        factList(i, n, fact, ans);
        System.out.println(ans);
    }
    static void factList(long i, long n, long fact, ArrayList<Long> ans){
        if(fact > n) return;
        ans.add(fact);
        factList(i+1, n, fact*(i+1), ans);
    }
}