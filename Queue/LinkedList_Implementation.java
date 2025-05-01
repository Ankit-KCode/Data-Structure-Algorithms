public class LinkedList_Implementation{
    Node top;
    Node prev;
    int size=0;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String args[]){
        LinkedList_Implementation qu = new LinkedList_Implementation();

        qu.push(10);
        qu.push(20);
        qu.push(30);
        qu.push(40);
        
        qu.pop();
        qu.pop();
        qu.push(60);
        qu.top();
        qu.size();
        qu.printQueue();

    }

    void push(int data){
        Node newNode = new Node(data);
        size++;
        if(top==null){
            top=newNode;
            prev = newNode;
            return;
        }

        prev.next = newNode;
        prev = newNode;
    }

    void pop(){
        if(top==null){
            System.out.println("Queue is Empty!");
            return;
        }

        size--;
        top = top.next;
    }

    void top(){
        System.out.println("Top: " + top.data);
    }

    void size(){
        System.out.println("Size: " + size);
    }

    void printQueue(){
        if(top==null){
            System.out.println("Queue is Empty!");
            return;
        }

        Node currNode = top;
        while(currNode!=null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
    }
}