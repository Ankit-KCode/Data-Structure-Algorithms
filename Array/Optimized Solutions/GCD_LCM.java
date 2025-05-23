public class GCD_LCM{
    public static void main(String args[]){
        int n1 = 52 , n2 = 10;
        int a = n1, b = n2;
        int GCD = 1;

        while(n1>0 && n2>0){
            if(n1 > n2) n1 = n1%n2;
            else n2 = n2%n1;
        }

        if(n1==0) GCD =  n2;
        else GCD = n1;

        int LCM = (a*b)/GCD;

        System.out.println("GCD: "+GCD);
        System.out.println("LCM: "+LCM);
    }
}