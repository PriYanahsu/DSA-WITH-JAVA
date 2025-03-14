import java.util.Scanner;

public class Practice {

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();

        String arr[] = line.split(" ");
        int count = 0;
        int total = 0;
        for(String s : arr){
            if(findNumber(s)){
                int number = Integer.parseInt(s);
                total += number;
                count++;
            }
        }

        double avg = (double) total / count;
        System.out.println("The number counts are " + total);
        System.out.printf("The avg is %.2f : ", avg);
    }

    private static boolean findNumber(String s) {

        char arr [] = s.toCharArray();
        for(char curr : arr) {
            if (!Character.isDigit(curr)) return false;
        }
        return true;
    }
}
