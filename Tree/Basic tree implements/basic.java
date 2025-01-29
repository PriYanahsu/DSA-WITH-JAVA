public class basic{

    public static class Node{
        int val;
        Node left;
        Node right;
    
    public Node(int val){
        this.val = val;
    }
}
public static void displayTree(Node root){
    if(root == null) return;

    System.out.print(root.val + " -> ");
    if(root.left != null) System.out.print(root.left.val + " ");
    if(root.right != null) System.out.print(root.right.val);
    System.out.println();
    displayTree(root.left);
    displayTree(root.right);
}

    public static void main(String arg[]){
        Node root = new Node(10);
        Node a = new Node(8);
        Node b = new Node(9);
        root.left = a;
        root.right = b;
        Node c = new Node(5);
        Node d = new Node(6);
        a.left = c;
        a.right = d;
        Node e = new Node(1);
        b.right = e;
        displayTree(root);
    }
}