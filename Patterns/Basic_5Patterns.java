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
        for(int row=0; row<n; row++){
            int num = 1;
            for(int col=0; col<=row; col++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }

    static void NumTriangle2(int n){
        int num = 1;
        for(int row=0; row<n; row++){
            for(int col=0; col<=row; col++){
                System.out.print(num + " ");
            }
            System.out.println();
            num++;
        }
    }
}