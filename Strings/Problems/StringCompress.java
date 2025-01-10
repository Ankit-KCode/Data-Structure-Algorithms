public class StringCompress{
    public static void main(String args[]){
        String S = "aaabbbbcdddde";
        System.out.println(StringCompress(S));
    }

    static String StringCompress(String S){
        StringBuilder ans = new StringBuilder("");

        int count = 1;
        int j=1;
        int n = S.length();
        for(int i=0; i<n-1; i++){
            
            if(S.charAt(j)==S.charAt(i)){
                count++;
                j++;
            }
            else{
                ans.append(S.charAt(i));
                if(count!=1){
                    ans.append(count);
                }
                count=1;
                j++;
            }
        }
        
        ans.append(S.charAt(j-1));
        if(count!=1){
            ans.append(count);
        }

        return ans.toString();

    }
}