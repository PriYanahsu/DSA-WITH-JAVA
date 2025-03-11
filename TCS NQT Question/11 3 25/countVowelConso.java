import java.util.Scanner;

public class countVowelConso {

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();

        int vowel = 0;
        int consonent = 0;
        for (char curr : str.toCharArray()) {
            if (Character.isLetter(curr)) {
                if ("aeiou".indexOf(curr) != -1) {
                    vowel++;
                } else {
                    consonent++;
                }
            }
        }
        System.out.println("Consonents are : " + consonent);
        System.out.println("Vowels are : " + vowel);
    }
}
