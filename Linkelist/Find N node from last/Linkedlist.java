public class Linkedlist{

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static class linkedlist{
        Node head = null;

        public void add(int data){
            Node temp = new Node(data);
            
            if(head == null){
                head = temp;
                return;
            }

            Node T = head;
                while(T.next != null){
                    T = T.next;
                }
                T.next = temp;
        }

        public void display(){

            Node temp = head;
            while(temp != null){
                System.out.print(temp.data +" -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }

        public int DeleteFromback(int n){
            Node curr = head;
            int size = 0;

            while(curr != null){
                size++;
                curr = curr.next;
            }

            int idx = size - n + 1;

            Node temp = head;
            for (int i = 1; i <= idx-1; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        public int deleteFromback2(int n){
            Node hair = head;
            Node turtle = head;

            for (int i = 1; i <= n; i++) {
                hair = hair.next;
            }

            while(hair != null){
                hair = hair.next;
                turtle = turtle.next;
            }
            return turtle.data;
        }
    }

    public static void main(String args[]){
        linkedlist LL = new linkedlist();
        LL.add(9);
        LL.add(8);
        LL.add(7);
        LL.add(2);
        LL.add(4);
        LL.add(1);
        
        LL.display();

        int n = 2;
        System.out.println(LL.DeleteFromback(n));
        System.out.println(LL.deleteFromback2(n));
    }
}