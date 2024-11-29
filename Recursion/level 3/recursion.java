import java.util.Scanner;
public class recursion {
    public static int printGCD(int x, int y){
        if(y == 0){
            return x;
        }
        return printGCD(y, x % y);
    }

public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    System.out.println(printGCD(n, m));
}
}