import java.util.Scanner;
public class BinaryToDecimal{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the binary number : ");
        int Binary_Num = sc.nextInt();

        int Number = 0;
        int power = 1;

        while(Binary_Num > 0){
            int unit_Num = Binary_Num % 10;
            Number += (unit_Num * power);
            power *= 2;
            Binary_Num /= 10;
        }
        System.out.println("The decimal number is : "+Number);
    }
}