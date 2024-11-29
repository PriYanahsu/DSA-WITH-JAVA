import java.util.ArrayList;
import java.util.Collections;
public class Bucket{
    public static void bucketSort(float[]arr){

        int n = arr.length;
        ArrayList<Float> Buckets[] = new ArrayList[n]; // create array of arraylist Size of N

        for (int i = 0; i < n; i++) {
            Buckets[i] = new ArrayList<Float>();       //create each arr[i] = one new arraylist
        }

        for (int i = 0; i < n; i++) {
            int Bucketidx = (int)arr[i] * n;          //add values in buckets 
            Buckets[Bucketidx].add(arr[i]);
        }

        for (int i = 0; i < Buckets.length; i++) {
            Collections.sort(Buckets[i]);            // Sort them by collection sort
        }

        int idx = 0;
        for (int i = 0; i < Buckets.length; i++) {
            ArrayList<Float> curr = Buckets[i];        //create a curr arraylist
            for (int j = 0; j < curr.size(); j++) {
                arr[idx++] = curr.get(j);             //add each element of curr list in array;
            }
        }
    }

    public static void main(String args[]){
        float arr[] = {0.2f,0.3f,0.5f,0.3f,0.7f,0.8f,0.9f};
        bucketSort(arr);

        for(float Val : arr){
            System.out.println(Val);
        }
}
}