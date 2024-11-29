import java.util.Scanner;
public class Reverse{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder("");
        String ans = "";

        for(int i=0; i<str.length();i++){
            char curr = str.charAt(i);

            if(curr != ' '){
                sb.append(curr);
            }
            else{
                sb.reverse();
                ans += sb;
                ans += " ";
                // sb.delete(0, sb.length());
                sb = new StringBuilder("");
            }
        }
        sb.reverse();
        ans += sb;
        System.out.println(ans);
    }
}