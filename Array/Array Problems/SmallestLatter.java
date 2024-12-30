public class SmallestLatter{
    public static void main(String[] args){
        char[] latter = {'c', 'f', 'j'};
        char target = 'j';
        char ans = SmallestLatter(latter, target);
        System.out.print("Latter is: " + ans);
    }

    static char SmallestLatter(char[] latter, char target){
        int start = 0;
        int end = latter.length - 1;

        while(start<=end){
            int mid = start + (end - start)/2;

            if(target<latter[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return latter[start % latter.length];


    }
}