public class PrintN{
    public static void main(String args[]){
        int n = 100; // Prints 1 - n;
        print(n);
    }

    static int count=0;
    
    static void print(int n){
        if(count == n) return;
        count++;
        System.out.print(count+" ");
        print(n);
    }
}