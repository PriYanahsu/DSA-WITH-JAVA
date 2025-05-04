package ArrayS;

import java.util.Scanner;

public class TobuySellStuck {

    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the value of an array -> ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findBestTime(arr));
    }

    private static int findBestTime(int[] arr) {

        int n = arr.length;
        int left = 0;
        int maxTime = 0;

        for(int right = 0; right<n; right++){
            if(arr[left]>arr[right]){
                left = right;
            }
            else maxTime = Math.max(maxTime, arr[right] - arr[left]);
        }
        return maxTime;
    }
}
