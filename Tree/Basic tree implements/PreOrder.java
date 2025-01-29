public class PreOrder {
    public static class Node{
        int val;
        Node left;
        Node right;
    
    public Node(int val){
        this.val = val;
    }
}

public static int height(Node root){   // for height
    if(root == null) return 0;
    if(root.right == null && root.left == null) return 0;

    return 1 + Math.max(height(root.left), height(root.right));
}
public static void displayPreTree(Node root){
    if(root == null) return;                         // Display preTree

    System.out.print(root.val + " -> ");
    displayPreTree(root.left);
    displayPreTree(root.right);
}

public static int max(Node root){                   // Display max value
    if(root == null) return Integer.MIN_VALUE;

    int a = root.val;
    int b = max(root.left);
    int c = max(root.right);

    return Math.max(a, Math.max(b,c));
}
public static int sum(Node root){                 //Display Sum value
    if(root == null) return 0;

    return root.val + sum(root.left) + sum(root.right);
}

public static int size(Node root){             //Display the size
    if(root == null) return 0;

    return 1 + size(root.left) + size(root.right);
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
        displayPreTree(root);
        System.out.println();
        System.out.println("The sum of tree is "+sum(root));
        System.out.println("The size of tree is "+size(root));
        System.out.println("The max value is " + max(root));
        System.out.println("The height is "+ height(root));
    }
}
