import java.util.Scanner;

public class MinimumInRotatedSortedArray {

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the value of an array -> ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findMinimum(arr));
    }

    private static int findMinimum(int[] arr) {

        int n = arr.length;
        int min = Integer.MAX_VALUE;

        int left = 0;
        int right = n-1;

        while(left<right){
            int mid = left +(right - left)  / 2;   // O(log n) complexity

            if(arr[mid] > arr[right]){
                left = mid+1;
            }
            else right = mid;
        }
        return arr[left];
    }
}
