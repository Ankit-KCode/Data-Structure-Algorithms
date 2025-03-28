class Node{
    int data;
    Node next;

    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }

    Node(int data1){
        this.data = data1;
        this.next = null;   
    }
};

public class LL_Basics{
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 8, 10};

        Node y = new Node(arr[1]);
        System.out.println(y.data);
    }
}