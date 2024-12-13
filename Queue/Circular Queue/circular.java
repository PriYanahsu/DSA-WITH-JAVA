public class circular{

    public static class queueA{
        int front = -1;
        int rare = -1;

        int [] arr = new int[5];
        int size = 0;

        public void add (int data) throws Exception{
            if(size == 0){
                front = rare = 0;
                arr[0] = data;
                size++;
                return;
            }
            else if(size == arr.length){
                throw new Exception("Array is full");
            }
            else if (rare == arr.length - 1) {
                rare = 0; // Wrap rare to the start
                arr[rare] = data;
            }
            else if(rare < arr.length-1){
                rare++;
                arr[rare] = data;
            }
            size++;
        }

        public int remove() throws Exception{
            if(size == 0){
                throw new Exception("Array is empty");
            }
            if (front == arr.length - 1) {
                int val = arr[front];
                front = 0;
                size--;
                return val;
            }
            else{
                int val = arr[front];
                front = front + 1;
                size--;
                return val;
            }
        }

        public int peek(){
            return rare;
        }

        public void display(){
            if(size == 0){
                System.out.println("Queue is empty");
                return;
            }
            
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[ (front+i) % arr.length] + " ");    // best  thing to rarate a array
            }
            System.out.println();
        }

    }
    public static void main (String arg[]) throws Exception{
        queueA circular = new queueA();
        circular.add(1);
        circular.add(2);
        circular.add(3);
        circular.add(4);
        circular.add(5);
        circular.display();
        circular.remove();
        circular.add(6);
        circular.display();

        for (int i = 0; i < circular.arr.length; i++) {
            System.out.print(circular.arr[i]+ " ");
        }
    }
}