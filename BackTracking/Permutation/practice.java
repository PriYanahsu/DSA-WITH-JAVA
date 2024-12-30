public class practice{
    public static void findPermutation(String str, String newStr){
        if(str.isEmpty()){
            System.out.println(newStr);
            return;
        }

        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            String left = str.substring(0,i);
            String right = str.substring(i+1);
            String remain = left + right;
            findPermutation(remain, newStr+curr);
        }
    }
    public static void main(String arg[]){
        String str = "abc";
        findPermutation(str, "");
    }
}