import java.util.Scanner;
public class SpiralMatrix{
    public static void SpiralMatrix(int matrix[][], int r, int c){

        int topRow = 0, bottomRow = r-1, leftColumn = 0, rightColumn = c-1;
        int totalValue = 0;

        while(totalValue < r * c){

            //top row = leftcolumn to Rightcolumn 
            for(int j = leftColumn; j <= rightColumn && totalValue < r * c ; j++){
                System.out.print(matrix[topRow][j] + " ");
                totalValue++;
            }
            topRow++;

            //rightcolumn = topRow+1 to bottomRow
            for(int i = topRow; i <= bottomRow && totalValue < r * c ; i++){
                System.out.print(matrix[i][rightColumn] + " ");
                totalValue++;
            }
            rightColumn--;
            
            // bottomrow = rightcolumn-11 to leftcolumn
            for(int j = rightColumn; j >= leftColumn && totalValue < r * c ; j--){
                System.out.print(matrix[bottomRow][j] + " ");
                totalValue++;
            }
            bottomRow--;

            // leftcolumn = bottmRow-1 + toprow
            for(int i = bottomRow; i >= topRow && totalValue < r * c ; i--){
                System.out.print(matrix[i][leftColumn] + " ");
                totalValue++;
            }
            leftColumn++;
        }
    }


    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int Matrix[][] = new int[row][col];

        for(int i = 0; i < row; i++){
            for (int j = 0; j < col; j++) {
                Matrix[i][j] = sc.nextInt();
            }
    }
    SpiralMatrix(Matrix, row, col);
    }
}