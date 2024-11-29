import java.util.Scanner;
public class factorial{
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }

        int fact = n * factorial(n-1);
        return fact;
    }

    public static void main(String arg []){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = factorial(n);
        System.out.println(fact);
    }
}