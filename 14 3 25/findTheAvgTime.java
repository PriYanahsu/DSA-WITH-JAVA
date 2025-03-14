import java.util.Scanner;

public class findTheAvgTime {

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        int days = 7;
        int timeCount = 0;

        for(int i=1; i<=days; i++){
            System.out.print("Enter the day "+ i + " Timing : ");
            int time = sc.nextInt();
            timeCount += time;
        }

        double avgTime = (double) timeCount / days;

        System.out.println("The maxCount time is : " + timeCount + " minutes");
        System.out.printf("The average time out are : %.2f minutes", avgTime);

    }
}
