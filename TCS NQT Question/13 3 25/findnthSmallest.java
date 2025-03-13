import java.util.*;

public class findnthSmallest {

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        int arr[] = {23,6,5,4,8,6,2,8,9,6,3,4};
        int k = sc.nextInt();

        Queue<Integer> qt = new PriorityQueue<>(Collections.reverseOrder());  // now it will remove larger value first;

        for(int a : arr){
            qt.add(a);

            while(qt.size() > k){
                qt.remove();
            }
        }

        System.out.println(qt.peek());
    }
}
