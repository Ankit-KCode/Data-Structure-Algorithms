public class get_ith_bit{
    public static void main(String args[]){
        int num = 10;
        int i = 12;

        int ans = get_ith_bit(num, i);
        System.out.println(ans);
    }

    static int get_ith_bit(int num, int i){

        int bitmask = 1<<i;

        if((num & bitmask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }
}