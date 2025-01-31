public class PrintNto1num{
    public static void main(String args[]){
        int n = 100;
        print(n);
    }
    static void print(int n){
        if(n==0) return;
        System.out.print(n+" ");
        print(n-1);
    }
}