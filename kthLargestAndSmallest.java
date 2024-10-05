
import java.util.Arrays;

public class kthLargestAndSmallest{

    public static void LargeSmall(int arr[], int idx){
        Arrays.sort(arr);
        int [] new_arr = new int[6];
        new_arr[0] = arr[0];
        new_arr[1] = arr[arr.length-1];
        idx = new_arr.length;
            for (int i = 1; i <= new_arr.length && i < arr.length; i++) {
                    new_arr[i+1] =  arr[i];
            }



        for (int i = 0; i < new_arr.length; i++) {
            System.out.println(new_arr[i]);
        }


    }
    public static void main(String[] args) {
        int arr[] = {5,2,1,9,7};
        int idx = 0;
        LargeSmall(arr, idx);
    }
}