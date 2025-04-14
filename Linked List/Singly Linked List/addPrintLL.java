public class addPrintLL{
    Node head;

    class Node{
        String data;
        Node next;

        Node(String data){ // Constructor Node
            this.data = data;
            this.next = null;
        }

        Node(String data, Node next){
            this.data = data;
            this.next = next;
        }
    }
    
    public static void main(String args[]){
        // Create Object of original class to create LL
        addPrintLL list = new addPrintLL();

        // Calling function and manupulating Data
        list.addFirst("There");
        list.addFirst("Hi!");
        // list.printList();

        list.addLast("What's Up");
        list.addMid("Buddy", 2);
        list.printList();
    }
    

    
    
    // ------- Insert Element In the Beginning ------------
    public void addFirst(String data){
        Node newNode = new Node(data); // Create New Node and Pass the data;
    
        if(head == null){ // If there is no element;
            head = newNode;
            return;
        }
    
        //If it is not Null - Already some elements;
        newNode.next = head;
        head = newNode;
    }


    // ------- Insert Element In the Last ------------
    public void addLast(String data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        // Traversing list to find last Node
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }

        // Adding new Node Value
        currNode.next = newNode;
    }

    // ------- Insert Element In the Middle ------------
    public void addMid(String data, int idx){
        if(idx == 0){
            addFirst(data);
            return;
        }

        // Traversing till idx-1 Index;
        Node currNode = head;
        for(int i=1; i<idx; i++){
            currNode = currNode.next;
        }

        //Create new Node(Data, Idx), Assign new Node
        Node newNode = new Node(data, currNode.next);
        currNode.next = newNode;
    }
    

    // ------- Traverse and Print Node --------------
    public void printList(){
        int count = 0;
        if(head==null){ // if list is Empty;
            System.out.println("List is Empty!");
            return;
        }

        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "-->");
            currNode = currNode.next;
            count++;
        }
        System.out.println("Null");

        System.out.println("Length Of Linked List: " + count);
    }
}
