import java.util.*;
public class List_Basics{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(4);
        list.add(5);
        list.add(1);

        System.out.println(list);

        list.remove(0);
        System.out.println(list);
    }
}