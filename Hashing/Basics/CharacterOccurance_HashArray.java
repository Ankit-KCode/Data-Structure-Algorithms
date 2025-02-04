public class CharacterOccurance_HashArray{
    public static void main(String args[]){
        char ch[] = {'a','b','c','d','a','b','c','d','e','f','g','h'};
        char c = 'b';
        int hash[] = new int[100];

        for(int i=0; i<ch.length; i++){
            hash[ch[i]-'a']++;
        }

        System.out.println(hash[c-'a']);
    }
}