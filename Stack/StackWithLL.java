
public class StackWithLL {
    
    public static class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    public static class Stack{
        Node head = null;
        int size = 0;

        void push(int val){
            Node temp = new Node(val);
            if(head == null){
                temp.next = head;
                head = temp;
                size++;
                return;
            }
            else{
                temp.next = head;
                head = temp;
            }
            size++;
        }

        int pop(){
            if(head == null){
                System.out.println("Stack is Empty");
                return -1;
            }
            Node curr = head;
            head = head.next;
            size--;
            return curr.val;
        }

        int peek(){
            return head.val;
        }

        void display(){
            if(head == null){
                System.out.println("Stack is Empty");
                return;
            }

            Node curr = head;
            while(curr!=null){
                System.out.print(curr.val+" ");
                curr = curr.next;
            }
            System.out.println();
        }

        // int size(){
        //     return size;
        // }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(5);
        st.display();
        st.push(8);
        st.display();
        st.push(6);
        st.display();
        st.push(9);
        st.display();

System.out.println(st.size);

        st.pop();
        st.display();
        st.pop();
        st.display();
        st.pop();
        st.display();
        st.pop();
        st.display();
    }
}

