public class ArrayImplement {
    
    public static class Stack{
        int [] arr = new int[5];
        int idx = 0;

        void push(int val){
            if(isFull()){
                System.out.println("Stack is full");
                return;
            }
            arr[idx] = val;
            idx++;
        }

        int peek(){
            if(idx == 0){
                System.out.println("Stack is empty");
                // return -1;
            }
            return arr[idx-1];
        }

        int pop(){
            if(idx == 0){
                System.out.println("Stack is empty");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return top;
        }
        void display(){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+ " ");
            }
            System.out.println();
        }

        int size(){
            return idx;
        }

        boolean isEmpty(){
            if(idx == 0) return true;
            else return false;
        }

        boolean isFull(){
            if(idx == arr.length){
                return true;
            }
            else{
                return false;
            }
        }
    }
    public static void main(String arg[]){
        Stack st = new Stack();
        st.push(5);
        st.display();
        st.push(6);
        st.display();
        st.push(7);
        st.display();
        st.push(8);
        st.display();
        st.push(9);
        st.display();
        st.push(9);
        st.display();


        st.pop();
        st.display();
        st.pop();
        st.display();
        st.pop();
        st.display();
        st.pop();
        st.display();
        st.pop();
        st.display();
        st.pop();
        st.display();

        System.out.println(st.size());
    }
}
