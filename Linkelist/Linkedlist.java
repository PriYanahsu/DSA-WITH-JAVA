public class Linkedlist {
    
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
            Node tail = null;

            public void delete(int idx){

                Node temp = head;

                if(idx == 0){
                    head = head.next;
                    return;
                }

                for (int i = 1; i <=idx-1; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                tail = temp;
            }

            public void addfirst(int data){
                Node temp = new Node(data);
                if(head == null){
                    head = temp;
                    tail = temp;
                }
                else{
                    temp.next = head;
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
                    tail = temp;
                }
            }

            public void insertAt(int idx, int data){

                Node T = new Node(data);
                Node temp = head;

                if(idx == size()){
                    addLast(data);
                    return;
                }

                else if(idx == 0){
                    addfirst(data);
                    return;
                }

                else if(idx<0 || idx>size()){
                    System.out.println("Index is out of range");
                }

                for (int i = 1; i <= idx-1; i++) {
                    temp = temp.next;
                }

                T.next = temp.next;
                temp.next = T;
            }

            public int getAt(int idx){
                Node temp = head;

                for (int i = 1; i <=idx; i++) {
                    temp = temp.next;
                }
                return temp.data;
            }

            public void display(){
                Node temp = head;
                
                while(temp != null){
                    System.out.print(temp.data + " -> ");
                    temp = temp.next;
                }
                System.out.println("null");
            }

            public int size(){
                Node temp = head;
                int count = 0;

                while(temp != null){
                    count++;
                    temp = temp.next;
                }
                return count;
            }
        }

        public static void main(String[] args) {
            linkedlist LL = new linkedlist();
            LL.addfirst(5);
            LL.display();
            LL.addfirst(10);
            LL.display();
            LL.addLast(12);
            LL.display();
            System.out.println(LL.size());
            LL.insertAt(1,50);
            LL.display();
            System.out.println(LL.tail.data);
            LL.insertAt(3,50);
            LL.display();
            System.out.println(LL.getAt(3));
            LL.delete(3);
            LL.display();
        }

}
