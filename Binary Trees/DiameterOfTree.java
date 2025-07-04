class Node{
    int data;
    Node left;
    Node right;

    public Node(int val) {
        data = val;
    }
    
}

public class DiameterOfTree{
    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(8);

        System.out.println("Tree Diameter = " + Diameter(root));
    }

    static int max = 0;

    static int Diameter(Node root){
        if(root==null) return 0;

        int lh = height(root.left);
        int rh = height(root.right);

        max = Math.max(max, lh+rh);

        Diameter(root.left);
        Diameter(root.right);

        return max;
    }

    static int height(Node root){
        if(root==null) return 0;

        int lh = height(root.left);
        int rh = height(root.right);

        return 1+Math.max(lh, rh);
    }
}