public class Special_Patterns{
    public static void main(String args[]){
        int r = 5, c = 9;
        Triangle1(r, c);
        Triangle2(r, c);

    }

    static void Triangle1(int r, int c){

        // int star = 1;
        for(int row=0; row<r; row++){
            // int space = (c-star)/2;
            // Space
            for(int col=0; col<(r-row-1); col++){
                System.out.print(" ");
            }
            // Star
            for(int col=0; col<row*2+1; col++){
                System.out.print("*");
            }
            // Space
            for(int col=0; col<(r-row-1); col++){
                System.out.print(" ");
            }
            // star += 2;
            System.out.println();
        }
    }

    static void Triangle2(int r, int c){
        for(int row=0; row<r; row++){
            //Space
            for(int col=0; col<row; col++){
                System.out.print(" ");
            }
            //Star
            for(int col=0; col<c-row*2; col++){
                System.out.print("*");
            }
            //Space
            for(int col=0; col<row; col++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}