package TwoDArray;

import java.util.Scanner;

public class RotateImage {

    public static void main (String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the rows : ");
        int row = sc.nextInt();

        System.out.print("Enter the cols : ");
        int cols = sc.nextInt();

        int arr[][] = new int[row][cols];

        System.out.println("Enter the value of array : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int ans[][] = findRotateImage(arr);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(ans[i][j] + ", ");
            }
            System.out.println();
        }
    }

    private static int[][] findRotateImage(int[][] arr) {

        int m = arr.length;
        int n = arr[0].length;

        int ans[][] = new int[m][n];

        int idx = 0;
        for(int i=0; i<m; i++){
            int idy = m-1;
            for(int j=0; j<n; j++){
                ans[i][j] = arr[idy--][idx];
            }
            idx++;
        }
        return ans;
    }
}
