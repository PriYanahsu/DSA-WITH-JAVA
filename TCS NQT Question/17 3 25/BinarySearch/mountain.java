package BinarySearch;

import java.util.Scanner;

public class mountain {

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        int arr[] = {1,2,9,4,5,6,8,9};

        int left = 0;
        int right = arr.length-1;

        while(left<right){
            int mid = left + (right - left) / 2;

            if(arr[mid-1] < arr[mid]){
                left = mid + 1;
            }
            else right = mid;
        }

        System.out.println(left-1);
    }
}
