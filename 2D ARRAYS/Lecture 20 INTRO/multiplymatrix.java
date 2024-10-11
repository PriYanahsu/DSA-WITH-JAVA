import java.util.Scanner;
 public class multiplymatrix {

    static void MulMatrix(int A[][],int r1, int c1, int B[][], int r2, int c2){

        if(c1 != r2){
            return;
        }
        int Mul[][] = new int[r1][c1];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    Mul[i][j] = A[i][k] + B[k][j];
                }
                
            }
        }
        
        System.out.println("The Multiply of matrixss are:  ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(Mul[i][j] + " ");
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

        int B[][] = new int[r2][c2];
        System.out.print("Enter the values of B : ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        MulMatrix(A, r1, c1, B, r2, c2);
    }
}
