import java.util.Scanner;
public class SumMatrix{
    static void AddMatrix(int A[][],int r1, int c1, int B[][], int r2, int c2){

        if(r1 != r2 || c1 != c2){
            return;
        }
        int Sum[][] = new int[r1][c1];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                Sum[i][j] = A[i][j] + B[i][j];
            }
        }
        
        System.out.println("The sum of matrixss are:  ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(Sum[i][j] + " ");
            }
            System.out.println();
            }
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of r1 : ");
        int r1 = sc.nextInt();
        System.out.print("Enter the number of c1 : ");
        int c1 = sc.nextInt();

        int A[][] = new int[r1][c1];
        System.out.print("Enter the values of A : ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the number of r2 : ");
        int r2 = sc.nextInt();
        System.out.print("Enter the number of c2 : ");
        int c2 = sc.nextInt();

        int B[][] = new int[r1][c1];
        System.out.print("Enter the values of B : ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        AddMatrix(A, r1, c1, B, r2, c2);
    }
}