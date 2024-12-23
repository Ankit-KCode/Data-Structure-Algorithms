public class SmallestLetter{
    public static void main(String args[]){
        char latter[]= {'c', 'f', 'j', 'k'};
        char target = 'b';

        int position = -1;
        int start = 0;
        int end = latter.length-1;

        while(start<=end){
            int mid = start + (end - start)/2;

            if(latter[mid]>target){
                position = mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }

        if(position == -1){
            System.out.println(latter[0]);
        }
        else{
            System.out.println(latter[position]);
        }

    }

}
