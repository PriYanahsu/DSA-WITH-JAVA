import java.util.Scanner;
public class etnerValueSpiral {
    public static int[][] SpiralMatrix(int n){

        int matrix[][] = new int[n][n];
        int topRow = 0, bottomRow = n-1, leftColumn = 0, rightColumn = n-1;
        int curr = 1;

        while(curr <= n * n){

            //top row = leftcolumn to Rightcolumn
            for(int j = leftColumn; j <= rightColumn && curr <= n * n ; j++){
                matrix[topRow][j] = curr++;
            }
            topRow++;

            //rightcolumn = topRow+1 to bottomRow
            for(int i = topRow; i <= bottomRow && curr <= n * n; i++){
                matrix[i][rightColumn] = curr++;
            }
            rightColumn--;
            
            // bottomrow = rightcolumn-11 to leftcolumn
            for(int j = rightColumn; j >= leftColumn && curr <= n * n ; j--){
                matrix[bottomRow][j] = curr++;
            }
            bottomRow--;

            // leftcolumn = bottmRow-1 + toprow
            for(int i = bottomRow; i >= topRow && curr <= n * n ; i--){
                matrix[i][leftColumn] = curr++;
            }
            leftColumn++;
        }
        return matrix;
    }

    public static void PrintMatrix(int Matrix[][]){

        for(int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[i].length; j++) {
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String arg []){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int matrix[][] = SpiralMatrix(n);
        PrintMatrix(matrix);
    }
}
