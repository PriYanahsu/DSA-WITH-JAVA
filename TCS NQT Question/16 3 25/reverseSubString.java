import java.util.Scanner;

public class reverseSubString {

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String [] strAr = str.split(" ");
        int n = strAr.length;

        String ans = "";
        int count = 0;
        for(int i=n-1; i>=0; i--){
            if(count%2==0){
                String curr = strAr[i].toLowerCase();
                ans += curr;
                ans += " ";
                count++;
            }else{
                String curr = strAr[i].toUpperCase();
                ans += curr;
                if(i!=0) ans += " ";
                count++;
            }
        }

        ans = ans.trim();  // we already used if in else condition
        System.out.println(ans);
        System.out.println(ans.length());
    }
}
