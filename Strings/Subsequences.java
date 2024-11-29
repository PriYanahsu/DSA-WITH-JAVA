
public class Subsequences{
    static void printSub (String Value, String newVal){
        if(Value.length() == 0){
            System.out.println(newVal);
            return;
        }

        char curr = Value.charAt(0);
        String remString = Value.substring(1);
        printSub(remString, newVal);
        printSub(remString, newVal + curr);

    }

    public static void main (String args[]){
        printSub("abc", "");
    }
}