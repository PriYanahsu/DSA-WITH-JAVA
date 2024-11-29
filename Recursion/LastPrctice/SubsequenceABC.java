public class SubsequenceABC {
    public static void Subseq(String str, String val){

        if(str.length() == 0){
            System.out.println(val);
            return;
        }

        char curr = str.charAt(0);
        String newString = str.substring(1);
        Subseq(newString, val);
        Subseq(newString, val + curr);
    }

    public static void main(String[] args) {
        String str = "abc";
        String newStr = "";
        Subseq(str, newStr);
    }
}
