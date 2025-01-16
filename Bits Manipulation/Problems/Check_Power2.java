public class Check_Power2{
    public static void main(String args[]){
        int num = 2;

        if((num & (num-1)) == 0){
            System.out.println("True!, It is a Power of Two.");
        }
        else{
            System.out.println("False!, No, It is not a Power of Two.");
        }
    }
}