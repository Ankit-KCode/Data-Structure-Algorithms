class Node{
    int data;
    Node left;
    Node right;

    public Node(int val) {
        data = val;
    }
    
}

public class HeightOfTree{
    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(8);

        System.out.println("Tree Height/Depth = " + treeHeight(root));
    }

    static int treeHeight(Node root){
        if(root==null) return 0;

        int lh = treeHeight(root.left);
        int rh = treeHeight(root.right);

        return 1+Math.max(lh, rh);
    }
}