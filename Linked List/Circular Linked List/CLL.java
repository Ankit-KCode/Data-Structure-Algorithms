public class CLL{
    Node head;
    Node tail;

    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
        
    }

    public static void main(String args[]){
        CLL list = new CLL();

        list.insert(80);
        list.insert(90);
        list.insert(100);
        list.insert(110);
        list.insert(120);
        list.delete(100);
        list.delete(80);
        list.print();


    }

    void insert(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.next = head;
        tail = newNode;

    }

    void print(){
        if(head==null){
            System.out.println("List is empty!");
            return;
        }

        Node currNode = head;
        // Traversing till reaching head again;
        if(head != null){
            do { 
                System.out.print(currNode.data + "->");
                currNode = currNode.next;
            } while (currNode != head);
        }
        System.out.println("head");
    }

    void delete(int val){
        if(head == null){
            System.out.println("List is empty!");
            return;
        }

        if(head.data == val){
            head = head.next;
            tail.next = head;
        }

        // Node currNode = head.next;
        Node preCurrent = head;

        do { 
            Node currNode = preCurrent.next;
            if(currNode.data == val){
                preCurrent.next = currNode.next;
                break;
            }
            preCurrent = preCurrent.next;
        } while (preCurrent != head);


    }
}