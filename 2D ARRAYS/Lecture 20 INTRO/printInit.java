import java.util.Scanner;
public class printInit{
    public static void PrintArr(int arr[][]){
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of cols : ");
        int cols = sc.nextInt();

        int twoD[][] = new int[rows][cols];
        System.out.print("Enter the values of arrays : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                twoD[i][j] = sc.nextInt();
            }
        }
        PrintArr(twoD);
    }
}