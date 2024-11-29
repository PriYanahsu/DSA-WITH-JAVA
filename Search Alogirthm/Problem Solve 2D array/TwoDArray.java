import java.util.Scanner;
public class TwoDArray{

    public static boolean Array(int arr[][], int target){

        int n = arr.length, m = arr[0].length;

        int s = 0, e = n * m - 1;

        while(s <= e){
            int mid = s + (e-s)/2;
            int Midval = arr[mid/m][mid%m];
            if(target == Midval) return true;
            if(target < Midval){
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int cols = sc.nextInt();
        int arr[][] = new int[row][cols];

        for(int i = 0; i<row; i++){
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int target = sc.nextInt();

        System.out.println(Array(arr, target));
    }
}