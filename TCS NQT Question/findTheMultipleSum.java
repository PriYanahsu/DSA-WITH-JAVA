import java.util.Scanner;

public class findTheMultipleSum {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number u want to multiply : ");
        int num = sc.nextInt();
        System.out.print("Enter the range : ");
        int range = sc.nextInt();

        int sum = 0;
        for(int i=1; i<=range; i++){
            sum += num * i;
        }

        System.out.println(sum);
    }
}
