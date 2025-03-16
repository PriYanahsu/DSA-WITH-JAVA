public class findMiddleEleLinkedListRmove {

    public static class Node{

        int val;
        Node next;

        public Node(int v){
            this.val = v;
            Node next = null;
        }
    }

    private static void removeEle(Node head){

        Node hair = head;
        Node turtle = head;
        Node prev = null;

        while(hair!=null && hair.next != null){
            hair = hair.next.next;
            prev = turtle;
            turtle = turtle.next;
        }
        prev.next = prev.next.next;
    }
    private static void printList(Node head) {

        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val + " -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String arg[]){

        Node a = new Node(1);
        Node b = new Node(2);
        a.next = b;
        Node c = new Node(3);
        b.next = c;
        Node d = new Node(4);
        c.next = d;
        Node e = new Node(5);
        d.next = e;
        printList(a);
        removeEle(a);
        printList(a);
        removeEle(a);
        printList(a);
        removeEle(a);
        printList(a);
    }
}
