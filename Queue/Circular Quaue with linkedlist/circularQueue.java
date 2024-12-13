public class circularQueue{

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static class ListQueue{
        Node head = null;
        Node tail = null;
        int size = 0;

        public void add(int data){
            Node temp = new Node(data);
            if(head == null){
                head = temp;
                tail = temp;
                tail.next = head;
            }
            else{
                tail.next = temp;
                tail = tail.next;
                tail.next = head;
            }
            size++;
        }

        public int remove() throws Exception{
            if(size == 0){
                throw new Exception("Queue is already empty");
            }
            else{
                int val = head.data;
                head = head.next;
                tail.next = head;
                size--;
                return val;
            }
        }

        public int peek(){
            return head.data;
        }

        public void display() throws Exception{
            if(size == 0){
                throw new Exception("The queue is empty");
            }

            Node temp = head;

            for (int i = 1; i <= size; i++) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception{
        ListQueue q1 = new ListQueue();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.display();
        q1.remove();
        q1.remove();
        q1.add(6);
        q1.add(7);
        q1.display();

        for (int i = 0; i < q1.size; i++) {
            System.out.print(q1.head.data + " ");
            q1.head = q1.head.next;
        }
    }
}