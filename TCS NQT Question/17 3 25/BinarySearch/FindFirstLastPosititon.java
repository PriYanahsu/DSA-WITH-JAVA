package BinarySearch;
import java.util.Scanner;

public class FindFirstLastPosititon {

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        int arr[] = {5,7,7,8,8,10,10};
        int k = 10;

        int left = 0;
        int right = arr.length-1;
        int firstIdx = -1;
        int lastIdx = -1;

        while(left<=right){
            int mid = left + (right-left) / 2;

            if(arr[mid]==k){
                if(k == arr[mid-1]){
                    firstIdx = mid-1;
                    lastIdx = mid;
                    break;
                }else{
                    firstIdx = mid;
                    lastIdx = mid+1;
                    break;
                }
            }
            else if(arr[mid] < k){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        System.out.println(firstIdx);
        System.out.println(lastIdx);
    }
}
