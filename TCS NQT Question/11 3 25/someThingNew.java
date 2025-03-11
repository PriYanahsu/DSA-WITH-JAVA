import java.util.ArrayList;
import java.util.Scanner;

public class someThingNew {


    public static void main (String arg[]){
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();

        while(sc.hasNext()){
            if(sc.hasNextInt()){
                arr.add(sc.nextInt());
            }else{
                String str = sc.next();
                if(str.equalsIgnoreCase("out")){
                    break;
                }
            }
        }
        System.out.println(arr);
    }
}
