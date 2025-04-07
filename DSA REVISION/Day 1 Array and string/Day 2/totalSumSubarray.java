//import java.util.ArrayList;
//
//public class totalSumSubarray {
//
//    public static void main (String arg[]){
//
//        int arr[] = {1,4,2,3,4,5};
//        int k = 3;
//
//        int count[] = new int[1];
//        findNumber(arr, k, count, 0, 0);
//
//        System.out.println(count[0]);
//    }
//
//    private static void findNumber(int[] arr, int k, int []count, int sum, int idx) {
//
//        if(sum == k){
//            count[0]++;
//            return;
//        }
//
//        for(int i=idx; i<arr.length; i++){
//            sum += arr[i];
//            findNumber(arr, k, count, sum, i+1);
//            sum -= arr[i];
//        }
//    }
//}

import java.util.HashMap;

public class totalSumSubarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -1, 2, 1};
        int k = 3;

        System.out.println("Total subarrays with sum " + k + ": " + subarraySum(arr, k));
    }

    public static int subarraySum(int[] nums, int k) {
        // HashMap to store prefixSum and its frequency
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // base case: prefixSum = 0 occurs once

        int count = 0;
        int prefixSum = 0;

        for (int num : nums) {
            prefixSum += num;

            // Check if there is a prefix sum that when removed gives sum = k
            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }

            // Update prefixSum frequency in the map
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}

