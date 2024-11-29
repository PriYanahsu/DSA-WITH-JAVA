public class Reverse{

    public static void main(String args[]){

        String str = "abc";
        String rev ="";

        for(int i = 0; i<str.length(); i++){
            char curr = str.charAt(i);
            rev = curr + rev;
        }
        System.out.println(rev);
    }
}