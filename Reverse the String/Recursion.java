public class Recursion {

    public static void StringRev(String str, String rev, int idx){
        if(idx == str.length()){
            System.out.println(rev);
            return;
        }

        char curr = str.charAt(idx);
        StringRev(str, curr+rev, idx+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        String rev = "";
        int idx = 0;
        StringRev(str, rev, idx);
    }
}
