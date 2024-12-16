import java.util.HashMap;

public class ValidPart{

    public static HashMap<Character, Integer> freqHash(String str){
        
        HashMap<Character, Integer> H = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);

            if(!H.containsKey(curr)){
                H.put(curr, 1);
            }
            else{
                H.put(curr, H.get(curr)+1);
            }
        }
        return H;
    }

    public static boolean validOR(String str1, String str2){

        if(str1.length() != str2.length()) return false;

        HashMap<Character, Integer> hp1 = freqHash(str1);
        HashMap<Character, Integer> hp2 = freqHash(str2);

        return hp1.equals(hp2);
    }

    public static void main(String[] args) {
        String str1 = "anngram";
        String str2 = "nagaram";
        boolean val = validOR(str1, str2);
        System.out.println(val);
    }
}