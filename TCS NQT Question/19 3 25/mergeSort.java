import java.util.Scanner;

public class mergeSort {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int arr[] = {2,1,47,5,4,7,6,7,9,1};

        int left = 0;
        int right = arr.length-1;

        divide(arr, left, right);

        for(int a: arr){
            System.out.print(a+ ", ");
        }
    }

    private static void divide(int[] arr, int left, int right) {

        if(left >= right) return;

        int mid = left + (right-left) / 2;
        divide(arr, left, mid);
        divide(arr, mid+1, right);
        conquer(arr, left, mid, right);
    }

    private static void conquer(int[] arr, int left, int mid, int right) {

        int merge[] = new int [right-left+1];

        int idx1 = left;
        int idx2 = mid+1;
        int x = 0;

        while(idx1<=mid && idx2<=right){
            if(arr[idx1] < arr[idx2]){
                merge[x++] = arr[idx1++];
            }else{
                merge[x++] = arr[idx2++];
            }
        }

        while(idx1<=mid){
            merge[x++] = arr[idx1++];
        }

        while(idx2<=right){
            merge[x++] = arr[idx2++];
        }

        for(int i=0; i<merge.length; i++){
            arr[left+i] = merge[i];
        }
    }
}
