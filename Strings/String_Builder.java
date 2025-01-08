public class String_Builder{
    public static void main(String args[]){
        //Declare and Initialize 
        StringBuilder sb = new StringBuilder("");

        for(char i='a'; i<='z'; i++){
            sb.append(i);
        }

        // All String Methods are applied to StringBuilder
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.charAt(25)); 
    }
}