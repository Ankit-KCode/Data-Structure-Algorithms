class Node{
    int data;
    Node left;
    Node right;

    public Node(int key){
        data = key;
    }
}

public class Tree_Implementation{
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.right = new Node(5);

        preorder(root);
    }

    // PreOrder Traversal-----------
    static void preorder(Node root){
        if(root == null) return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
}
