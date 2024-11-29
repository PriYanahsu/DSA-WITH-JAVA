public class BasicLinkedList{

    public static class Node{

        int data;    // this is the value of present Node
        Node next;   // this is the address pf next node

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static int length(Node head){

        int count = 0;
        Node temp = head;

        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void displayRecursive(Node head){
        if(head == null){
            System.out.println("null");
            return;
        }
        System.out.print(head.data+ "->");
        display(head.next);
    }

    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+ "-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String arg[]){
        Node x1 = new Node(5);
        Node x2 = new Node(7);
        Node x3 = new Node(2);
        Node x4 = new Node(6);
        Node x5 = new Node(1);

        // Simple or u can say basic way to apply linkedList
        x1.next = x2;
        x2.next = x3;
        x3.next = x4;
        x4.next = x5;

        System.out.println(x1.next.data);

        display(x1);
        displayRecursive(x1);

        System.out.println(length(x1));

        //Display Node
        // Node temp = x1;
        // while(temp!=null){
        //     System.out.print(temp.data+ "->");
        //     temp = temp.next;
        // }
        // System.out.println("null");

    }
}




