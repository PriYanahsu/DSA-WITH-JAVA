import java.util.Scanner;
public class Atername {
    public static int alter(int n){
        if(n == 0){
            return 0;
        }

        if(n%2 == 0){
            return alter(n-1) - n;
        }
        return alter(n-1) + n;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = alter(n);
        System.out.println(m);
    }
}
