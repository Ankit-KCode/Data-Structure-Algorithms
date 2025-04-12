
public class DLL{
    Node head;
    Node tail;

    class Node{
        int data;
        Node prev;
        Node next;
    
        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    
    public static void main(String args[]){
        DLL list = new DLL();

        list.addFirst(40);
        list.addFirst(50);
        list.addFirst(60);
        list.addFirst(70);
        list.addFirst(80);
        list.addFirst(90);
        list.print();

    }

    //Add First
    public void addFirst(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        newNode.prev = null;
        if(head != null) head.prev = newNode; //Head may contain null value so checking null pointer;
        head = newNode;
    }


    //Print List
    public void print(){
        if(head==null){
            System.out.println("List is empty!");
            return;
        }

        Node currNode = head;
        Node lastNode = null; // for reverse

        System.out.println("Traversing Forward--");
        while(currNode != null){
            System.out.print(currNode.data + "<->");
            lastNode = currNode; // for reverse
            currNode = currNode.next; //Moving to Next Node
        }
        System.out.println("null");


        System.out.println();

        // Reverse 
        System.out.println("Traversing in Reverse--");
        while(lastNode != null){
            System.out.print(lastNode.data + "<->");
            lastNode = lastNode.prev;
        }
        System.out.println("null");

    }
}