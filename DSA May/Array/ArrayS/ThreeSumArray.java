package ArrayS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ThreeSumArray {

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the value of an array -> ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        List<List<Integer>> ans = findThreeSum(arr);

        System.out.println(ans.toString());
    }

    private static List<List<Integer>> findThreeSum(int[] arr) {

        int n = arr.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);

        for(int i=0; i<n-2; i++){

            if(i>0 && arr[i]==arr[i-1]) continue;

            int left = i+1;
            int right = n-1;

            while(left<right){

                int sum = arr[i] + arr[left] + arr[right];
                if(sum==0){
                    ans.add(Arrays.asList(arr[i], arr[left], arr[right]));

                    while(left<right && arr[left]==arr[left+1]) left++;
                    while(left<right && arr[right]==arr[right-1]) right--;

                    left++;
                    right--;
                }
                else if(sum<0) left++;
                else right--;
            }
        }
        return ans;
    }
}




























