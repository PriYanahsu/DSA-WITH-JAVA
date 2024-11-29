import java.util.Scanner;
public class broutforceGCD{
    public static void printGCD(int n, int m){

        for (int i = m; i >= 0; i--) {
            if(m % i == 0 && n % i == 0){
                System.out.println(i);
                break;
            }
        }
    }
    

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        printGCD(n, m);
    }
}