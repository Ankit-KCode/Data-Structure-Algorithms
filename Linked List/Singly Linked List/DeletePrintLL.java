class DeletePrintLL{
    Node head;

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String args[]){
        DeletePrintLL list = new DeletePrintLL();
        list.insert("Hello!");
        list.insert("What's Up");
        list.insert("How's going");
        list.insert("Hello World");

        // list.deleteFirst(); // First Node Deleted
        
        // list.printLL();

        // list.deleteLast(); // Last Node Deleted

        list.deleteThis(5); // Delete Any Index Node

        list.printLL();


    }
    
    // ----------Delete First--------------------
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty!");
            return;
        }

        head = head.next;
    }

    public void deleteThis(int idx){
        if(head==null){
            System.out.println("List is Empty!");
            return;
        }

        if(idx==1){
            deleteFirst();
            return;
        }
        
        int count=1;
        Node currNode = head.next;
        Node prevNode = head;
        while(currNode !=null){
            count++;
            if(count==idx){
                prevNode.next = currNode.next;
                return;
            }
            prevNode = prevNode.next;
            currNode = currNode.next;
        }
        System.out.println("No Node Deleted - Index Out Of Bond! Enter Currect index.");
    }

    // ----------Delete Last---------------------
    public void deleteLast(){
        if(head == null){
            System.out.println("List is Empty!");
            return;
        }

        if(head.next == null){ // if list contains Only one Node
            head = null; // last node deleted
            return;
        }

        // Find Second Last Node & Assign it to null;
        Node secondlast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondlast = secondlast.next;
        }

        secondlast.next = null;
    }
    


   
    // ------------- Insert and Print ------------------
    public void printLL(){
        if(head == null){
            System.out.println("List is empty!");
            return;
        }

        Node lastNode = head;
        while(lastNode != null){
            System.out.print(lastNode.data + "-->");
            lastNode = lastNode.next;
        }
        System.out.println("Null");
    }

    public void insert(String data){
        Node newNode =  new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node lastNode = head;

        while(lastNode.next != null){
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }
}