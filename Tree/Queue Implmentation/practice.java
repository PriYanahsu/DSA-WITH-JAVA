import java.util.LinkedList;
import java.util.Queue;
public class practice{

    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }

        public static void displayTree(Node root){
            Queue<Node> qt = new LinkedList<>();
            qt.add(root);
            while(qt.size()>0){
                Node temp = qt.peek();
                if(temp.left != null) qt.add(temp.left);
                if(temp.right != null) qt.add(temp.right);
                System.out.print(temp.data + " ");
                qt.remove();
            }
        }

        public static void main (String arg[]){
            Node a = new Node(10);
            Node b = new Node(9);
            Node c = new Node(8);
            a.left = b;
            a.right = c;
            Node d = new Node(7);
            Node e = new Node(6);
            b.left = d;
            b.right = e;
            Node f = new Node(5);
            c.right = f;
            displayTree(a);
        }
    }
}