package kadanesAlgorithm;

import java.util.Scanner;

public class MaximumSubarray {

        public static void main (String args[]) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the size of an array : ");
            int n = sc.nextInt();

            int arr[] = new int[n];

            System.out.println("Enter the value of an array -> ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(findMaxiMum(arr));
        }

    private static int findMaxiMum(int[] arr) {

//            int maxCount = 0;
//            int n = arr.length;
//            int count = 0;
//
//            for(int right=0; right<n; right++){
//                if(count < 0){
//                    count = 0;
//                }
//                count += arr[right];
//                maxCount = Math.max(maxCount, count);
//            }
//            return maxCount;

        int maxValue = Integer.MIN_VALUE;
        int maxCount = 0;

        for(int a : arr){
            maxCount = Math.max(a, maxCount+a);
            maxValue = Math.max(maxValue, maxCount);
        }
        return maxValue;
    }
}
