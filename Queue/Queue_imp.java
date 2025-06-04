import java.util.*;
public class Queue_imp{
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        // Queue<Integer> q = new ArrayDeque<>();
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.remove();

        System.out.println(q);
        System.out.println("Top: " + q.peek());
    }
}