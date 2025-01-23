public class Basic_5Patterns{
    public static void main(String args[]){
        int n = 5;
        Rectangle(n);
        Triangle1(n);
        Triangle2(n);
        NumTrangle1(n);
        NumTriangle2(n);
        
    }

    static void Rectangle(int n){
        for(int row=0; row<n; row++){
            for(int col=0; col<n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Triangle1(int n){
        for(int row=0; row<n; row++){
            for(int col=0; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Triangle2(int n){
        for(int row=0; row<n; row++){
            for(int col=0; col<n-row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    

    static void NumTrangle1(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static void NumTriangle2(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}