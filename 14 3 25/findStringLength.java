import java.util.Scanner;

public class findStringLength {


    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        String str = "50125";
        int n = str.length();
        int count = 0;

        for(int i=0; i<n; i++){
            int stringCount = 0;
            for(int j=i; j<n; j++){
                stringCount += str.charAt(j) - '0';
                if(stringCount != (j-i+1)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
