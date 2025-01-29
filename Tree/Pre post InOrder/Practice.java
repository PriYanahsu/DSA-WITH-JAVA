public class Practice{

    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }

    public static void preOrder(Node root){
        if(root == null) return;
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void postOrder(Node root){
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+ " ");
    }

    public static void inOrder(Node root){
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.val+ " ");
        inOrder(root.right);
    }

    public static void main(String arg[]){
        Node root = new Node(10);
        Node a = new Node(9);
        Node b = new Node(8);
        root.left = a;
        root.right = b;
        Node c = new Node(7);
        Node d = new Node(6);
        a.left = c;
        a.right = d;
        Node e = new Node(5);
        Node f = new Node(4);
        b.left = e;
        b.right = f;
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
    }
}