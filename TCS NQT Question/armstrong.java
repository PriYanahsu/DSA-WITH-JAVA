import java.util.Scanner;

public class armstrong {


    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(findArmstrong(num)){
            System.out.println("The number "+ num + " is a armstrong Number");
        }
        else{
            System.out.println("The number "+ num + " is a not armstrong Number");
        }
    }

    private static boolean findArmstrong(int num) {

        int ans = 0;
        int length = String.valueOf(num).length();
        int val = num;

        while(num>0){
            int digit = num % 10;
            ans += Math.pow(digit, length);
            num /= 10;
        }

        return val == ans;
    }
}
