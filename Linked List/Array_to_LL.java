class Node{
    int data;
    Node next;

    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    Node(int data){
        this.data = data;
        this.next = null;
    }
};

class Array_to_LL{

    public static void main(String args[]){
        int[] arr = {4, 2, 8, 9, 99};

        Node head = convertLL(arr);
        System.out.println(head.data); //printing head;

        print(head.next); // Traversing list;
    }

    // ---------Convert Array into Linked List : O(n)--------------
    private static Node convertLL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;

        for(int i=0; i<arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    
    // -------- Traversing the Linked List -------------------
    static void print(Node head){
        if(head == null){
            System.out.println("List is Empty!");
            return;
        }

        Node newNode = head;
        while(newNode != null){
            System.out.print(newNode.data + "-->");
            newNode = newNode.next;
        }
        System.out.print("Null");
    }
}

