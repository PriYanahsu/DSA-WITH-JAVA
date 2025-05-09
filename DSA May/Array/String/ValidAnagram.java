package String;

import java.util.HashMap;
import java.util.Scanner;

public class ValidAnagram {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String string1 : ");
        String str1 = sc.nextLine();

        System.out.print("Enter the String string2 : ");
        String str2 = sc.nextLine();

        System.out.println(validAnagram(str1, str2));
    }

    private static boolean validAnagram(String str1, String str2) {

        if(str1.length() != str2.length()) return false;

        HashMap<Character, Integer> hash1 = new HashMap<>();
        for(char curr : str1.toCharArray()){
            hash1.put(curr, hash1.getOrDefault(curr, 0)+1);
        }

        HashMap<Character, Integer> hash2 = new HashMap<>();
        for(char curr : str2.toCharArray()){
            hash2.put(curr, hash2.getOrDefault(curr, 0)+1);
        }

        return hash1.equals(hash2);
    }
}
