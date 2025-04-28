public class Array_Implementation{
    
    public static void main(String args[]){
        stack st = new stack();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        // st.pop();
        st.top();
        st.size();
        st.printStack();
    }
    
}

class stack{
    int[] arr = new int[10];
    int top = -1;
    
    void push(int num){
        if(top == arr.length-1){
            System.out.println("Stack Overflow!");
            return;
        }
        top++;
        arr[top] = num;
    }

    void pop(){
        if(top==-1){
            System.out.println("Stack is Empty!");
        }
        top--;
    }

    void top(){
        if(top==-1){
            System.out.println("Stack is Empty!");
            return;
        }
        System.out.println(arr[top]);
    }

    void size(){
        System.out.println(top+1);
    }

    void printStack(){
        if(top == -1){
            System.out.println("Stack is Empty!");
        }

        for(int i=0; i<=top; i++){
            System.out.print(arr[i]+" ");
        }
    }
}