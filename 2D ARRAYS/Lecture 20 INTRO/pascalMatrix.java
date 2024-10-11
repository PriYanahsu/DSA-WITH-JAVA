import java.util.Scanner;
public class pascalMatrix{
    public static int[][] pascelmat(int n){

        int Pascel[][] =new int[n][];

        for (int i = 0; i < n; i++) {
            Pascel[i] = new int[i+1];

            Pascel[i][0] = Pascel[i][i] = 1;

            for (int j = 1; j < i; j++) {
                Pascel[i][j] = Pascel[i-1][j] + Pascel[i-1][j-1];
            }
        }
        return Pascel;
    }

    public static void printArr(int arr[][]){
        System.out.println("The Pasis : ");
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = pascelmat(n);
        printArr(arr);
    }
}