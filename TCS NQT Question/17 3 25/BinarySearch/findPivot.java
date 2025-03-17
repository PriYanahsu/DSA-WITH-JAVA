package BinarySearch;

import java.util.Scanner;

public class findPivot {

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        int arr[] = {5,6,7,8,9,1,2,3,4};

        int left = 0;
        int right = arr.length-1;

        while(left<right){

            int mid = left + (right-left) / 2;
            if(arr[mid] > arr[mid+1]){
                System.out.print("The start is "+ (mid + 1));
                break;
            }
            else if(arr[left] <= arr[mid]){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
    }
}
