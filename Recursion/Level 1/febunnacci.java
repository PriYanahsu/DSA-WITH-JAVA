import java.util.Scanner;
public class febunnacci {
    public static int n1 = 0;
    public static int n2 = 1;
    public static void febunnacci(int n){
        if(n == 0){
            return;
        }
        int n3 = n1 + n2;
        System.out.print(", "+ n3);
        n1 = n2;
        n2 = n3;
        febunnacci(n-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(n1 + ", " + n2);
        febunnacci(n-2);
    }
}
