import java.util.Scanner;
public class TransposeMatrix{
    public static int[][] Transpsee(int arr[][], int rows, int cols){

        // int trans[][] = new int[rows][cols];
        // for (int i = 0; i < rows; i++) {                       //for all matrixess
        //     for (int j = 0; j < cols; j++) {
        //         trans[i][j] = arr[j][i];
        //     }
        // }

        for (int i = 0; i < rows; i++) {
            for (int j = i; j < cols; j++) {                    //for square matrix only
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        
        int n = arr.length;
        for (int i = 0; i < rows; i++) {
            int left = 0;
            int right = n-1;
            while( left < right){
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }
        }
        return arr;
    }

    public static void printArr(int arr[][]){
        System.out.println("The transpose Matrix is : ");
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the rer rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the rer cols : ");
        int cols = sc.nextInt();

        int arr[][] = new int[rows][cols];

        System.out.println("Enter the value of matrixx : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int trans[][] = Transpsee(arr, rows, cols);
        printArr(trans);
    }
}