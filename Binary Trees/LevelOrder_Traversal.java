import java.util.*;
class Node{
    int data;
    Node left;
    Node right;

    public Node(int key){
        data = key;
    }
}

public class LevelOrder_Traversal{
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.print(LevelOrder(root));
    }

    static List<List<Integer>> LevelOrder(Node root){
        List<List<Integer>> ans = new ArrayList<>();
        Queue<Node> qu = new LinkedList<>();

        if(root==null) return ans;

        qu.offer(root);
        while(!qu.isEmpty()){
            int n = qu.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<n; i++){
                if(qu.peek().left!=null) qu.offer(qu.peek().left);
                if(qu.peek().right!=null) qu.offer(qu.peek().right);
                list.add(qu.poll().data);
            }
            ans.add(list);
        }
        return ans;
    }
}