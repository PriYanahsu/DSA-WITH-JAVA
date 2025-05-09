package String;

import java.util.*;

public class LongestSubstringWithoutReapeatingChar {

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String value : ");
        String str = sc.nextLine();

        findTheString(str);
    }

    private static void findTheString(String str) {

        Set<Character> set = new HashSet<>();
        int n = str.length();
        int max = 0;
        int left = 0;
        for(int right=0; right<n; right++){
            while(set.contains(str.charAt(right))){
                set.remove(str.charAt(left++));
            }
            set.add(str.charAt(right));
            max = Math.max(max, set.size());
        }
        System.out.println(max);
    }
}
