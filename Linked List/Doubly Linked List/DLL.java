
public class DLL{
    Node head;
    Node tail;

    class Node{
        int data;
        Node prev;
        Node next;
        
        // Singly Linked List
        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }

        // Doubly Linked List
        Node(Node prev, int data, Node next){
            this.prev = prev;
            this.data = data;
            this.next = next;
        }
    }
    
    public static void main(String args[]){
        DLL list = new DLL();

        list.addLast(40);
        list.addLast(50);
        list.addFirst(60);
        list.addFirst(70);
        list.addFirst(80);
        list.addFirst(90);
        list.addMid(100, 6);
        list.addMid(30, 0);
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

    // Adding Last
    public void addLast(int data){
        Node newNode = new Node(data);

        if(head == null){
            newNode.prev = null;
            head = newNode;
            return;
        }

        Node currNode = head;

        while(currNode.next != null){
            currNode = currNode.next; 
        }
        currNode.next = newNode;
        newNode.prev = currNode;
        newNode.next = null;
        
    }

    // Insert in Between
    public void addMid(int data, int idx){
        if(idx == 0){
            addFirst(data);
            return;
        }

        Node currNode = head;
        for(int i=1; i<idx; i++){
            currNode = currNode.next;
        }

        //New Node with (prev, data, next);
        Node newNode = new Node(currNode, data, currNode.next);
        currNode.next = newNode;
        if(newNode.next != null) newNode.next.prev = newNode; //Null Pointer Check
    }
    // Now implement this using Number, not Index;


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