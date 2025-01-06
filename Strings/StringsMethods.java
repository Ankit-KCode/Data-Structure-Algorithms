public class StringsMethods{
    public static void main(String args[]){
        String say = "Hello World!";
        // Print Characters of Strings -----------------
        System.out.println(say.charAt(6));
        System.out.println(say.charAt(11));
        charprint(say);

        // String comparison----------------
        //will be equal in with value and method.
        String str1 = "hi";
        String str2 = "hi";

        //Below is not Equal because it check method & value Both: so it is not equal.
        String str3 = "ok";
        String str4 = new String("ok");
        if(str3 == str4) System.out.print("Equal");
        else System.out.println("Not Equal");

        //if want to check only value
        if(str3.equals(str4)) System.out.println("Equal");
        else System.out.println("Not Equal");

        //Substring ------------------------
        String line = "Hello world";
        Substring(line, 2, 7);

        //Using Built in String Method
        String subline = line.substring(2, 7);
        System.out.println(subline);

    }

    //Functions for call
    static void Substring(String line, int s, int e){
        String substring = "";
        for(int i=s; i<e; i++){
            substring = substring + line.charAt(i);
        }
        System.out.println(substring);
    }


    static void charprint(String say){
        for(int i=0; i<say.length(); i++){
            System.out.print(say.charAt(i)+" ");
        }
        System.out.println();
    }
}