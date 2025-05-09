package String;

import java.util.HashMap;
import java.util.Scanner;

public class LongestRepeatingCharReplacement {

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();

        System.out.print("Enter the k : ");
        int k = sc.nextInt();

        System.out.println(findTheLongest(str, k));
    }

    private static int findTheLongest(String str, int k) {

        int [] freq = new int[26];
        int left = 0;
        int max = 0, maxFreq=0;

        for(int right=0; right<str.length(); right++){
            freq[str.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq, freq[str.charAt(right) - 'A']);

            while((right-left+1)-maxFreq > k){
                freq[str.charAt(left) - 'A']--;
                left++;
            }
            max = Math.max(max, right-left+1);
        }
        return max;
    }
}
