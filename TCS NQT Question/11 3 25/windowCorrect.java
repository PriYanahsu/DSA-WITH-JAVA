import java.util.LinkedList;
import java.util.Queue;

public class windowCorrect {

    public static void main(String arg[]){
        String str = "abcabcdfghbbabckwkobeadkiol";

        System.out.println(findLongestStr(str));
    }

    private static String findLongestStr(String str) {

        Queue<Character> q = new LinkedList<>();
        int maxSize = 0;
        String nstr = "";
        String maxStr = "";

        for(char curr : str.toCharArray()){
            if(!q.contains(curr)) {
                q.add(curr);
                nstr += curr;
                maxSize = Math.max(maxSize, q.size());
                if(nstr.length() > maxStr.length()){
                    maxStr = nstr;
                }
            }else{
                q.clear();
                nstr="";
                nstr+=curr;
                q.add(curr);
            }
        }
        return maxStr;
    }
}
