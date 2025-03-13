import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class findnthLargest {


//    public static void main(String arg[]){
//        Scanner sc = new Scanner(System.in);
//        int arr [] = {2,3,5,4,6,2,1,7,8,9,6,5};
//
//        Arrays.sort(arr);
//        for(int n : arr){
//            System.out.print(n + ",");
//        }
//        System.out.println();
//
//        int k = sc.nextInt();
//
//        System.out.println(arr[arr.length-k]);
//    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2, 3, 5, 4, 6, 2, 1, 7, 8, 9, 6, 5};

        int k = sc.nextInt();

        Queue<Integer> qt = new PriorityQueue<>();

        for(int a : arr){
            qt.add(a);

            while(qt.size()>k){
                qt.remove();
            }
        }

        System.out.println(qt.peek());
    }
}
