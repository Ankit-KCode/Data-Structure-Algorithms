import java.util.Scanner;
public class StringsBasics{
    public static void main(String args[]){

        //Declare and Initialize String
        String str = "Let's Code.";
        String str1 = new String("Let's Start.");

        System.out.println(str + "\n" + str1);

        //Input String
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        //String str2 = sc.nextLine(); //.next : input only one word | .nextLine : All Words.

        //System.out.println("Name: "+str2);

        // String Methods--------------------
        // String size:
        int size = str.length();
        System.out.println("Length: " + size);

        // String Concatenation
        String Firstname = "Alex";
        String Lastname = "Max.";
        System.out.println(Firstname+ " " +Lastname);

    }
}