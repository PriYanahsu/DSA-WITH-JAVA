package ArrayS;

import java.util.Scanner;

public class MaxWaterStore {

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the value of an array -> ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(MaxHStore(arr));
    }

    public static int MaxHStore(int[] arr) {

        int n = arr.length;
        int maxArea = 0;

        int left = 0, right=n-1;

        while(left<right){

            int length = Math.min(arr[left], arr[right]);
            int breadth = right - left;

            int area = length*breadth;
            maxArea = Math.max(area, maxArea);

            if(arr[left] < arr[right]) left++;
            else right--;
        }
        return maxArea;
    }
}
