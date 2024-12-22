public class Array_Diff{
    public static void main(String args[]){
        int[] a1 = {1};
        int[] a2 = {1, 0, 0, 0, 0, 0};
        int[] diff = new int[a2.length];

        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = diff.length - 1;

        int crr = 0;
        
        while(k>=0){
            int d;
            int a1v = i >= 0? a1[i]: 0;

            if(a2[j] + crr >= a1v){
                d = a2[j] + crr - a1v;
                crr = 0;
            }
            else{
                d = a2[j] + crr + 10 - a1v;
                crr = -1;
            }

            diff[k] = d;

            i--;
            j--;
            k--;
        }

        // int idx = 0;
        // while(idx < diff.length){
        //     if(diff[idx] == 0){
        //         idx++;
        //     }
        //     else{
        //         break;
        //     }
        // }
        
        for(k=0; k<diff.length; k++){
            System.out.print(diff[k] + " ");
        }
    }
}