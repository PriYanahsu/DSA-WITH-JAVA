import java.util.Scanner;
public class Toggle{

    public static void main(String arg[]){
        Scanner sc = new Scanner (System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());

        for(int i = 0; i< str.length(); i++){

            boolean flag = true;  // for capital later
            char ch = str.charAt(i);
            if(ch == ' ') continue;
            int asci = (int) ch;

            if(asci >= 97) flag=false;   // for small letter
            if(flag == true){
                asci += 32;
                char dh = (char) asci;
                str.setCharAt(i, dh);
            }
            else{
                asci -= 32;
                char dh = (char) asci;
                str.setCharAt(i, dh);
            }
        }
        System.out.println(str);
    }
}