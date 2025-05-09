package String;

public class longestPalindromic {

    public static void main(String arg[]){
            System.out.println(longestPalindrome("babad")); // Output: "bab" or "aba"
            System.out.println(longestPalindrome("cbbd"));  // Output: "bb
    }

    private static String longestPalindrome(String str) {

        if(str.length()<1) return "";

        int start = 0, end = 0;
        for(int i=0; i<str.length(); i++){

            int odd = findPalindrome(str, i, i);
            int even = findPalindrome(str, i, i+1);
            int len = Math.max(odd, even);

            if(end-start < len){
                start = i - (len-1) / 2;
                end = i + len / 2;
            }
        }
        return str.substring(start, end+1);
    }

    private static int findPalindrome(String str, int i, int j) {

        while(i>0 && j<str.length() && str.charAt(i)==str.charAt(j)){
            i--;
            j++;
        }
        return j-i-1;
    }
}
