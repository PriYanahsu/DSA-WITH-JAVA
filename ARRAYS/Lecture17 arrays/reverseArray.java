import java.util.Scanner;
public class reverseArray {

    public static int[] reverSe(int arr[], int i, int j){

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }

    public static int[] Rotate(int arr[], int k){
        int n = arr.length;
        int mid = n - k;

        reverSe(arr, 0, mid-1);
        reverSe(arr, mid, n-1);
        reverSe(arr, 0, n-1);

        return arr;
    }

    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ ", ");
        }
        System.out.println();
    }

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Rotate(arr, k);
        printArr(arr);
    }
}
