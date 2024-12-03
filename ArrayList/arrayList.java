// How to use Arraylist

import java.util.Arrays;

public class arrayList{


    public static class ArrayList{
        int [] arr = new int [2];

        int size = 0;
        int idx = 0;

        public void add(int element){
            if(size == arr.length){
                // int [] brr = Arrays.copyOf(arr,arr.length*2);
                // arr = new int[brr.length];
                // arr =  Arrays.copyOf(arr,arr.length*2);

                int [] brr = Arrays.copyOf(arr,arr.length*2);
                arr = brr;
            }

            arr[idx] = element;
            idx++;
            size++;
        }

        public int size(){
            return size;
        }
        
        public void set(int idx, int val){
            arr[idx] = val;
        }

        public void get(){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+", ");
            }
        }

    }
    public static void main(String args[]){
        ArrayList arr = new ArrayList();
        arr.add(1);
        arr.add(2);
        System.out.println(arr.size());
        arr.add(5);
        arr.add(4);
        System.out.println(arr.size());
        arr.set(1, 20);
        arr.get();
    }
}

// this implies that arraylist switch their size Double when it gets Full by data
// Also It is very flexible 
