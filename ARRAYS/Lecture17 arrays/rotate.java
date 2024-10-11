
import java.util.Scanner;

public class rotate {
    public static int[] rotate(int arr[], int k){
        int n = arr.length;
        int Newarr[] = new int[n];
        int mid = n-k;

        int j = 0;
        for(int i = mid; i < n; i++){
            Newarr[j++] = arr[i];
        }

        for(int i = 0; i < mid; i++){
            Newarr[j++] = arr[i];
        }
        
        int m = 0;
        for (int i = 0 ; i < Newarr.length; i++) {
            arr[m++] = Newarr[i];
        }
        return arr;
    }
    public static void print(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ ", ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        int k = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        rotate(arr,k);
        print(arr);
    }
}
