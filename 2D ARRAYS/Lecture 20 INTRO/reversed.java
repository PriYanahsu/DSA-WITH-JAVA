import java.util.Scanner;
public class reversed{
    public static void reversemat(int[][]a, int r1, int c1){
        
        for (int i = 0; i < r1; i++) {
        int left = 0;
        int right = c1-1;
            while(left < right){
                int temp = a[i][left];
                a[i][left] = a[i][right];
                a[i][right] = temp;
                left++;
                right--;
            }

        }

        
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
    }

    public static void main(String arg []){
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
        reversemat(A, r1, c1);
    }
}