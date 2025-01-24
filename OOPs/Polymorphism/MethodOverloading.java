public class MethodOverloading{
    public static void main(String args[]){
        int a = 20 , b = 10;
        int c = 55;
        sum(a, b);
        sum(a, b, c);
    }

    //Method Overloading - Compile Time
    static void sum(int a, int b){
        int sum = a+b;
        System.out.println("Sum: " + sum);
    }

    static void sum(float a, float b){
        float sum = a+b;
        System.out.println("Sum: " + sum);
    }

    static void sum(int a, int b, int c){
        int sum = a+b+c;
        System.out.println("Sum: " + sum);
    }

    static void sum(float a, float b, float c){
        float sum = a+b+c;
        System.out.println("Sum: " +sum);
    }
}