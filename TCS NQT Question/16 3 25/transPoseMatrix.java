import java.util.Scanner;

public class transPoseMatrix {

    public static void main(String arg[]){
        Scanner sc =  new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int arr[][] = new int[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int ans[][] = new int[m][n];

        for(int i=0; i<m; i++){
            int k = i;
            int l = 0;
            for(int j=0; j<n; j++){
                ans[i][j] = arr[l++][k];
            }
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(ans[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
