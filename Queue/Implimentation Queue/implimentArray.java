public class implimentArray{

    public static class queueA{

        int front = 0;
        int rare = 0;
        int size = 0;
        int arr[] = new int[5];

        public void add(int val){
            if(size == arr.length){
                System.out.println("The QueueA is full");
                return;
            }
            if(front == 0){
                arr[front] = val;
                arr[rare++] = val;
            }else{
                arr[rare++] = val;
            }
            size++;
        }

        public int remove(){
            if(size == 0){
                System.out.println("The queueA is empty");
                return -1;
            }
            int x = arr[front];
            front++;
            size--;
            return x;
        }

        public void display(){
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i]+ " ");
            }
        }

        public boolean isEmpty(){
            if(size == 0){
                return true;
            }
            return false;
        }

        public int peek(){
            return front;
        }
    }
    public static void main(String arg[]){
        queueA Qa = new queueA();
        Qa.add(5);
        // Qa.add(5);
        // Qa.add(5);
        // Qa.add(5);
        // Qa.add(5);
        Qa.display();
        System.out.println(Qa.isEmpty());
    }
}