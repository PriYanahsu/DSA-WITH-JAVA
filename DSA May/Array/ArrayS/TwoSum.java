package ArrayS;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the value of an array -> ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target : ");
        int x = sc.nextInt();

        int newStr [] = twoSum(arr, x);

        for(int s : newStr) System.out.print(s + ", ");
    }

    private static int[] twoSum(int[] arr, int target) {

        int n = arr.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            int second = target - arr[i];
            if(map.containsKey(second)) return new int []{i, map.get(second)};
            map.put(arr[i], i);
        }

        return new int[]{};
    }
}
