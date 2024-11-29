import java.util.Scanner;
public class multyOfn{
    public static void printMul(int n, int k){
        if(k == 1){
            System.out.println(n);
            return;
        }

        printMul(n, k-1);
        System.out.println(n * k);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        printMul(n, k);
    }
}