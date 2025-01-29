public class Extreme_Patterns{
    public static void main(String args[]){
        int n = 5;

        Pattern1(n);
        Pattern2(n);
        Pattern3(n);
        Pattern4(n);
    }


    static void Pattern1(int n){
        // Part 1
        for(int i=0; i<n; i++){
            //Star
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }
            //Space
            for(int j=0; j<i*2; j++){
                System.out.print(" ");
            }
            //Star
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Symmetry
        // Part 2

        for(int i=0; i<n; i++){
            //Star
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            //Space
            int space = 2*(n-i);
            for(int j=0; j<space-2; j++){
                System.out.print(" ");
            }
            //Star
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // --------------------------------

    static void Pattern2(int n){
        for(int i=0; i<n; i++){
            // Part 1
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }

            int space = 2*(n-i);
            for(int j=0; j<space-2; j++){
                System.out.print(" ");
            }

            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        //Symmetry
        // Part 2
        for(int i=1; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }

            for(int j=0; j<2*i; j++){
                System.out.print(" ");
            }

            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    // --------------------------------
    static void Pattern3(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0) System.out.print("*");
                else if(i==n-1) System.out.print("*");
                else if(j==0) System.out.print("*");
                else if(j==n-1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    // --------------------------------
    static void Pattern4(int n){
        for(int i=0; i<2*n-1; i++){

            for(int j=0; j<2*n-1; j++){
                int top = i;
                int left = j;
                int right = (2*n - 2) - j;
                int down = (2*n - 2) - i;

                System.out.print(n - Math.min(Math.min(top, down), Math.min(right, left)) + " ");
            }
            System.out.println();
        }
    }
}