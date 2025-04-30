public class LinkedList_Implementation{
    Node top;
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
        LinkedList_Implementation st = new LinkedList_Implementation();
        st.push(10);
        st.push(20);
        st.push(50);
        st.push(40);
        st.pop();
        st.pop();
        st.top();
        st.size();
        st.printStack();

    }


    void push(int data){
        Node newNode = new Node(data);
        size++;

        if(top==null){
            top = newNode;
            return;
        }
        newNode.next = top;
        top = newNode;
    }

    void pop(){
        if(top==null){
            System.out.println("Stack is Empty!");
            return;
        }
        size--;

        if(top.next==null){
            top = null;
            return;
        }

        top = top.next;
    }

    void top(){
        System.out.println("Top : "+top.data);
    }

    void size(){
        System.out.println("Size : "+size);
    }


    void printStack(){
        if(top==null){
            System.out.println("Stack is Empty!");
            return;
        }

        Node currNode = top;
        while(currNode != null){
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }

    }
}