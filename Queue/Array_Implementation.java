public class Array_Implementation{
    public static void main(String args[]){
        queue qu = new queue();
        
        qu.push(10);
        qu.push(20);
        qu.push(30);
        qu.push(40);
        qu.pop();
        qu.pop();

        qu.push(80);
        qu.push(90);
        qu.push(100);
        // qu.push(120);
        // qu.push(140);
        // qu.push(150);
        // qu.push(200);
        qu.pop();
        qu.top();
        qu.printQueue();
    }
}

class queue{
    int[] arr = new int[5];  // Size=5
    int start = -1;
    int end = -1;
    int currSize = 0;

    void push(int num){
        if(currSize == arr.length) {
            System.out.println("Queue is Full!");
            return;
        }

        if(currSize == 0){
            start = 0;
            end = 0;
            // arr[end] = num;
            // currSize++;
        }
        else{
            end = (end+1)%arr.length;
        }
        arr[end]=num;
        currSize++;
    }

    void pop(){
        if(currSize==0){
            System.out.println("Queue is Empty!");
            return;
        }
        if(currSize==1){
            start = end = -1;
        }
        else{
            start = (start+1)%arr.length;
        }
        currSize--;
    }

    void top(){
        if(currSize==0){
            System.out.println("Queue is Empty!");
            return;
        }
        System.out.println("Top : " + arr[start]);
    }

    void printQueue(){
        if(currSize==0){
            System.out.println("Queue is Empty!");
            return;
        }

        // Debugged and Printing in Circular Way.
        int temp = start;
        while(temp != end){
            System.out.print(arr[temp]+" ");
            temp = (temp+1)%arr.length;
        }
        System.out.print(arr[end]);
    }
}