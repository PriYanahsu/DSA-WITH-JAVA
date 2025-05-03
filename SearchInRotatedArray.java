import java.util.Scanner;

public class SearchInRotatedArray {

        public static void main(String arg[]){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the size of an array : ");
            int n = sc.nextInt();

            int arr[] = new int[n];

            System.out.println("Enter the value of an array -> ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("Enter the number to find -> ");
            int target = sc.nextInt();

            System.out.println(findMinimum(arr, target));
        }

    private static int findMinimum(int[] arr, int target) {

            int left = 0;
            int right = arr.length - 1;

            while(left < right){

                int mid = left + (right - left) / 2;

                if(arr[mid] == target) return mid;

                else if(arr[mid] > arr[left]){
                    if(arr[left] > target && arr[mid]>target){
                        left = mid+1;
                    }
                    else right = mid;
                }
                else{
                    if(arr[right] > target && arr[mid]>target){
                        right = mid-1;
                    }else left = mid;
                }
            }
            return -1;
    }
}
