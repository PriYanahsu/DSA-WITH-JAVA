import java.util.Scanner;

public class diMondPrint {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0; i<n; i++){

            for(int j=n-i-1; j>0; j--){
                System.out.print(" ");
            }
            int A = 1;
            for(int j=1; j<=i+1; j++){
                System.out.print(A);
                A++;
            }
            if(i == 0){
                System.out.println();
                continue;
            }
            int Z = i;
            for(int j=1; j<=i; j++){
                System.out.print(Z);
                Z--;
            }
            System.out.println();
        }

        for(int i=0; i<n-1; i++){

            for(int j=1; j<=i+1; j++){
                System.out.print(" ");
            }

            int A = 1;
            for(int j = 1; j<=n-i-1; j++){
                System.out.print(A);
                A++;
            }

            int M = n-i-2;
            for(int j=n-i-2; j>0; j--){
                System.out.print(M);
                M--;
            }

            System.out.println();
        }
    }
}
