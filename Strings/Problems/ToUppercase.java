public class ToUppercase{
    public static void main(String[] args){
        String str = "hi, i am ankit.";
        System.out.println(ToUppercase(str));
    }

    static String ToUppercase(String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }

        // String strUP = sb.toString();
        // System.out.println(strUP);
        return sb.toString();
    }
}