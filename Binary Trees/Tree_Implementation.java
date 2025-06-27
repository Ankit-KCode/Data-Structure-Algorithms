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

        System.out.print("Preorder Traversal: ");
        preorder(root);
        System.out.println();
        System.out.print("Inorder Traversal: ");
        inorder(root);

    }

    // PreOrder Traversal-----------
    static void preorder(Node root){
        if(root == null) return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Inorder Traversal -----------
    static void inorder(Node root){
        if(root==null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}
