import java.util.Scanner;
public class second{
    public static int printGCD(int x, int y){

        while(x % y != 0){

            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;
    }

public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    System.out.println(printGCD(n, m));
}
}