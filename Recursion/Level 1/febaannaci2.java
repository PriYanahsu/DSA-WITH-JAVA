import java.util.Scanner;
public class febaannaci2 {
    public static int febonaccii(int n){
        if (n == 0 || n == 1){
            return n;
        }

        int prev = febonaccii(n-1);
        int prevprev = febonaccii(n-2);
        return prev + prevprev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(febonaccii(i));
        }
    }
}
