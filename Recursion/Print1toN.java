public class Print1toN{
    public static void main(String args[]){
        int n = 100; // Prints 1 - n;
        int count=0;
        print(n,count);
    }

    static void print(int n, int count){
        if(count == n) return;
        count++;
        System.out.print(count+" ");
        print(n, count);
    }
}