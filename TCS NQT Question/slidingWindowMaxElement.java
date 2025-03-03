import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;

public class slidingWindowMaxElement {

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int length = sc.nextInt();

        int arr[] = new int[length];
        for(int i=0; i<length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value k : ");
        int k = sc.nextInt();

        int ans[] = findMaxEle(arr, k);

        for(int an : ans){
            System.out.print(an + ",");
        }

    }

    private static int[] findMaxEle(int[] arr, int k) {

        Queue<Integer> qt = new LinkedList<>();

        int [] ans = new int[arr.length - k + 1];
        int z = 0;

        for(int i=0; i<k; i++){
            qt.add(arr[i]);
        }

        for(int i=k; i<arr.length; i++){
            ans[z++] = Collections.max(qt);
            qt.remove(k-i+1);

            qt.add(arr[i]);
        }
        ans[z++] = Collections.max(qt);

        return ans;
    }
}
