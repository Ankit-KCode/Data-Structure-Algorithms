public class PelinedromNum{
    public static void main(String[] args) {
        int num = 1331;
        boolean pelindrom = true;

        String str = String.valueOf(num);

        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)) pelindrom = false;
        }

        System.out.println(pelindrom);

    }
}