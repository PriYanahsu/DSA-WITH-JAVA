import java.util.Scanner;

public class matrixMinimumMedium {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int cols = sc.nextInt();
        int matrix[][] = new int[row][cols];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        double min = findTheMinimum(matrix);
        System.out.println(min);
    }

    private static double findTheMinimum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        double minVal = Integer.MAX_VALUE;

        for (int i = 0; i < m; i++) {
            double finalVal;

            if (n % 2 == 0) {
                finalVal = (matrix[i][n / 2 - 1] + matrix[i][n / 2]) / 2.0;
            } else {
                finalVal = matrix[i][n / 2];
            }

            minVal = Math.min(minVal, finalVal);
        }
        return minVal;
    }
}
