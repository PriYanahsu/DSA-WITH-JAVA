package TwoDArray;

import java.util.Scanner;

public class SetMatrixZero {

    public static void main (String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the rows : ");
        int row = sc.nextInt();

        System.out.print("Enter the cols : ");
        int cols = sc.nextInt();

        int arr[][] = new int[row][cols];

        System.out.println("Enter the value of array : ");
        for(int i=0; i<row; i++){
            for(int j=0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        changeToZero(arr);

        for(int i=0; i<row; i++){
            for(int j=0; j<cols; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void changeToZero(int[][] arr) {

        int m = arr.length;
        int n = arr[0].length;

        int zeroR = 0;
        int zeroC = 0;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j] == 0){
                    zeroR = i;
                    zeroC = j;
                }
            }
        }

        for(int i=0; i<m; i++){
            arr[i][zeroC] = 0;
        }

        for(int j=0; j<n; j++){
            arr[zeroR][j] = 0;
        }
    }
}
