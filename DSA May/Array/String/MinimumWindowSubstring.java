package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MinimumWindowSubstring {

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String s : ");
        String str1 = sc.nextLine();

        System.out.print("Enter the String t : ");
        String str2 = sc.nextLine();

        System.out.println(findTheOutput(str1, str2));
    }

    private static String findTheOutput(String s, String t) {

        if(s==null || t==null || s.length()<t.length()){
            return "";
        }

        Map<Character, Integer> need = new HashMap<>();
        for(char c : t.toCharArray()){
            need.put(c, need.getOrDefault(c, 0)+1);
        }

        Map<Character, Integer> window = new HashMap<>();
        int left=0, right=0;
        int valid=0;
        int start=0, len=Integer.MAX_VALUE;

        while(right<s.length()){
            char c = s.charAt(right++);
            if(need.containsKey(c)){
                window.put(c, window.getOrDefault(c, 0)+1);
                if(window.get(c).equals(need.get(c))){
                    valid++;
                }
            }

            while(valid==need.size()){
                if(right-left < len){
                    start = left;
                    len = right-left;
                }
                char d = s.charAt(left++);
                if(need.containsKey(d)){
                    if(window.get(d).equals(need.get(d))){
                        valid--;
                    }
                    window.put(d, window.get(d)-1);
                }
            }
        }

        return len==Integer.MAX_VALUE ? "" : s.substring(start, start+len);
    }
}
