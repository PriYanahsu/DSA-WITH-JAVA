public class createDoubly{

    public static class Node{
        
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static class linkedlist{
        Node head = null;
        Node tail = null;

        public void addfirst(int data){
            Node temp = new Node(data);

            if(head == null){
                head = temp;
                tail = temp;
            }
            else{
                temp.next = head;
                head.prev = temp;
                head = temp;
            }
        }

        public void addLast(int data){
            Node temp = new Node(data);

            if(head == null){
                head = temp;
                tail = temp;
            }
            else{
                tail.next = temp;
                temp.prev = tail;
                tail = temp;
            }
        }

        public void display(){
            Node curr = head;
            System.out.print("null <-> ");
            while(curr != null){
                System.out.print(curr.data + " <-> ");
                curr = curr.next;
            }
            System.out.println("null");
        }

        public void displayRandom(int random){
            Node ran = new Node(random);

            while(ran.prev != null){
                ran = ran.prev;
            }
            Node Head = ran;

            while(Head != null){
                System.out.print(Head.data + " -> ");
                Head = Head.next;
            }
            System.out.println("null");
        }

        public static void main(String args[]){
            linkedlist LL = new linkedlist();

            LL.addfirst(5);
            LL.addfirst(12);
            LL.addfirst(20);
            LL.addfirst(2);
            LL.addLast(15);
            LL.addLast(15);
            LL.display();
            LL.displayRandom(15);
        }
    }
}