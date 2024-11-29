import java.util.Scanner;
public class RowsandCols{

    public static boolean Array(int arr[][], int target){

        int n = arr.length, m = arr[0].length;
        int i = 0; int j = m-1;

        while(i < n && j >= 0){
            if(target == arr[i][j]) return true;
            if(target < arr[i][j]){
                j--;
            }
            if(target > arr[i][j]){
                i++;
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