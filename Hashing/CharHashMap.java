import java.util.*;
public class CharHashMap{
    public static void main(String args[]){
        String str = "abcsdefdhrtredssaaaa";

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        System.out.println(map);
        System.out.println(map.get('a'));

        // Traversing through HashMap
        // for(Map.Entry<Character, Integer> entry : map.entrySet()){
        //     if(entry.getValue()==minFreq){
        //         System.out.println(entry.getKey()+"="+minFreq);
        //     }
        // }
        
    }
}