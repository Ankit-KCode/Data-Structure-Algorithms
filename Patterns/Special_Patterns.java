public class Special_Patterns{
    public static void main(String args[]){
        int n=5;
        // NumPattern1(n);
        NumTriangle2(n);
    }

    
    static void NumPattern1(int n){
    
        for(int i=1; i<=n; i++){
            //Increasing Nums
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }

            //Space
            for(int j=1; j<=(2*n-2*i); j++){
                System.out.print(" ");
            }

            //Decreasing Nums
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    
    static void NumTriangle2(int n){

        int count = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

}