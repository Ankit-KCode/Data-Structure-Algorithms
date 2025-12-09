public class SecondLargest{
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        SecondLargest2(arr);

    }

    static void SecondLargest2(int[] arr){
        int max2 = Integer.MIN_VALUE;
        int max = arr[0];

        for(int num : arr){
            if(num > max){
                max2 = max;
                max = num;
            }
            else if(num!=max && num>max2) max2 = num;
        }

        System.out.println(max2);
    }

    static void SecondLargest1(int[] arr){
        int max = arr[0];
        int max2 = Integer.MIN_VALUE;

        for(int num : arr){
            if(num > max) max = num;
        }
        for(int num : arr){
            if(num>max2 && num<max) max2 = num;
        }

        System.out.println(max2);
    }
}