import java.util.*;
public class Linked_List{
    public static void main(String args[]){
        // Linked List As List
        LinkedList<Integer> list = new LinkedList<>();

        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        
        list.addFirst(10); //O(1)
        list.addLast(60);  //O(1)

        System.out.println(list);


    }
}