import java.util.Scanner;

public class determineCubes {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        int cube = 0;

        for(int i=start; i<=end; i++){
            cube += (i*i*i);
        }

        System.out.println("The cube is : "+ cube);
    }
}
