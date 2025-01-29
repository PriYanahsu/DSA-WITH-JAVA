public class minimum{

    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }

    public static int findmin(Node root){
        if(root == null) return Integer.MAX_VALUE;

        int a = root.val;
        int b = findmin(root.left);
        int c = findmin(root.right);

        return Math.min(a, Math.min(b,c));
    }

    public static int productVal(Node root){
        if(root == null) return 1;

        int leftPro = productVal(root.left);
        int rightPro = productVal(root.right);

        return (root.val * leftPro * rightPro);
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
        System.out.println(findmin(root));
        System.out.println(productVal(root));
    }
}