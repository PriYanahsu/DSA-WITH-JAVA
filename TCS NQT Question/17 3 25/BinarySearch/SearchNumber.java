package BinarySearch;

import java.util.Scanner;

public class SearchNumber {

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        int arr[] = {1,2,4,8,9};
        int k = 9;

        int left = 0;
        int right = arr.length-1;

        while(left<=right){
            int mid = left + (right-left) / 2;

            if(arr[mid] == k){
                System.out.println(mid);
                return;
            }
            else if(arr[mid] < k){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        System.out.println("No Found");
    }
}
