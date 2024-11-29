import java.util.Scanner;
public class ToggleString {

    public static void main(String arg[]){
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();

        for(int i = 0; i< str.length(); i++){

            boolean flag = true;  // for capital later
            char ch = str.charAt(i);
            if(ch == ' ') continue;
            int asci = (int) ch;

            if(asci >= 97) flag=false;   // for small letter
            if(flag == true){
                asci += 32;
                char dh = (char) asci;
                str = str.substring(0,i) +dh+ str.substring(i+1);
            }
            else{
                asci -= 32;
                char dh = (char) asci;
                str = str.substring(0,i) +dh+ str.substring(i+1);
            }
        }
        System.out.println(str);
    }
}

// this string is poor performance code because string in java is very pooor as compare to string builder
