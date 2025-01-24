public class Medium_4Patterns{
    public static void main(String args[]){
        int n = 5;
        Triangle1(n);
        Triangle2(n);
        Symmetry1(n);
        NumTriangle(n);

    }

    static void Triangle1(int n){

        // int star = 1;
        for(int row=0; row<n; row++){
            // int space = (c-star)/2;
            // Space
            for(int col=0; col<(n-row-1); col++){
                System.out.print(" ");
            }
            // Star
            for(int col=0; col<row*2+1; col++){
                System.out.print("*");
            }
            // Space
            for(int col=0; col<(n-row-1); col++){
                System.out.print(" ");
            }
            // star += 2;
            System.out.println();
        }
    }

    static void Triangle2(int n){
        for(int row=0; row<n; row++){
            //Space
            for(int col=0; col<row; col++){
                System.out.print(" ");
            }
            //Star
            for(int col=0; col<(n-row)*2-1; col++){
                System.out.print("*");
            }
            //Space
            for(int col=0; col<row; col++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    static void Symmetry1(int n){
        for(int row=0; row<=2*n-1; row++){
            int star = row;
            if(row>n) star = 2*n-row;
            for(int col=0; col<star; col++){
                System.out.print("*");
            }
            System.out.println();
        }

        // for(int row=0; row<n; row++){
        //     for(int col=0; col<row+1; col++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // // for Reverse (n-1)
        // for(int row=0; row<n; row++){
        //     for(int col=0; col<n-row-1; col++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    }

    static void NumTriangle(int n){
        for(int row=0; row<n; row++){
            for(int col=0; col<row+1; col++){
                if((col&1)!=0){
                    System.out.print("0 ");
                }
                else{
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }
}