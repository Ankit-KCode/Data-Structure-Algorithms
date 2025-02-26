import java.util.*;
public class List_Basics{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        // Append Elements into ArrayList
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(1);

        System.out.println(list);

        // Remove any Elements
        list.remove(0); 
        System.out.println(list);

        // change specific element
        list.set(1, 10); // Overlap the element
        System.out.println(list);

        // checking the element in list
        System.out.println(list.contains(1));
        System.out.println(list.contains(99));

        // Adding element at specific index
        list.add(0, 100); // O(n)
        System.out.println(list);

        // Access/Retrieve the specific index element
        System.out.println(list.get(0));

        // To get the Size of the ArrayList
        System.out.println(list.size());
    }
}