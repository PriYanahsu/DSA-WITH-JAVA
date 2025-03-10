import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class multipleTen {

    public static void main(String arg[]){

        int arr[] = {1,2,10,50,5,8,90,8,6,30,4,11};

        findQue(arr);

        for(int a : arr){
            System.out.print(a + ", ");
        }
    }

    private static void findQue(int[] arr) {

        Queue<Integer> q = new LinkedList<>();
        int j = 0;


        for(int i=0; i<arr.length; i++){
            if(arr[i]%10!=0){
                arr[j++] = arr[i];
            }
            else{
                q.add(arr[i]);
            }
        }

//        int n = arr.length-1;
        while(!q.isEmpty()){
            arr[j++] = q.remove();
        }
    }
}
