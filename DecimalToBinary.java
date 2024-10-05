import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String args[]){
        Scanner sc
         = new Scanner(System.in);

        int Decimal_num = sc.nextInt();

        int Binary_Num = 0;
        int mul = 1;

        while(Decimal_num > 0){
            int rem = Decimal_num % 2;
            Binary_Num += (rem * mul) ;
            mul *= 10;
            Decimal_num /= 2;
        }
        System.out.println(Binary_Num);
    }
}
