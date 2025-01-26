public class Alphabetical_Patterns{
    public static void main(String args[]){
        int n = 5;
        // Pattern1(n);
        // Pattern2(n);
        // Pattern3(n);
        // Pattern4(n);
        Pattern5(n);
    }

    static void Pattern1(int n){

        for(int i=0; i<n; i++){

            for(char j='A'; j<='A'+i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void Pattern2(int n){

        for(int i=0; i<n; i++){

            for(char j='A'; j<'A'+(n-i); j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void Pattern3(int n){
        char ch = 'A';
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }
    }

    static void Pattern4(int n){

        for(int i=0; i<n; i++){
            //Space
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            //Characters
            int breakpoint = (2*i+1)/2;
            char ch='A';
            for(int j=1; j<=2*i+1; j++){
                System.out.print(ch);
                if(j<=breakpoint) ch++;
                else ch--;
            }
            //Space
            for(int j=0; j<n-1; j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    static void Pattern5(int n){
        
        for(int i=0; i<n; i++){

            for(char j=(char)('E'-i); j<='E'; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}