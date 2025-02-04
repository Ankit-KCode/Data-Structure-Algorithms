public class StringCharOccurance{
    public static void main(String args[]){
        String str = "abBcdabcdAAabcdeBfghijJ";
        char c = 'B';
        int hash[] = new int[256];

        for(int i=0; i<str.length(); i++){
            hash[str.charAt(i)]++;
        }

        System.out.println(hash[c]);
    }
}