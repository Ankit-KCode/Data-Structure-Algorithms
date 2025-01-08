public class ShortestPath{
    public static void main(String args[]){
        String path = "WNEENESENNN";

        System.out.println(ShortestPath(path));
    }

    static int ShortestPath(String path){
        int x = 0;
        int y = 0;
        for(int i=0; i<path.length(); i++){
            if(path.charAt(i)=='W'){
                x--;
            }
            else if(path.charAt(i)=='N'){
                y++;
            }
            else if(path.charAt(i)=='E'){
                x++;
            }
            else{
                y--;
            }
        }

        int d = x*x + y*y;
        return (int)Math.sqrt(d);
    }
}