
public class implimentation{

    public static class Node{
        int data;
        Node next;

        Node (int data){
            this.data = data;
            this.next = null;
        }
    }

    public static class queueA{
        Node head = null;
        Node tail = null;
        int size = 0;

        public void add(int data){
            Node temp = new Node(data);
            if(head == null){
                head = temp;
                tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public int remove(){
            if(size == 0){
                System.out.println("The queueA is empty");
                return-1;
            }
            int data = head.data;
            head = head.next;
            size--;
            return data;
        }

        public int peek(){
            return head.data;
        }

        public boolean isEmpty(){
            if(size == 0){
                return true;
            }
            return false;
        }

        public void display(){
            Node temp = head;

            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String arg[]){
        queueA LQ = new queueA();
        LQ.add(5);
        LQ.add(5);
        LQ.add(5);
        LQ.add(5);
        LQ.display();
        System.out.println(LQ.size);
    }
}