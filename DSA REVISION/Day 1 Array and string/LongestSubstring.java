public class LongestSubstring {

    public static void main (String arg[]){

        String str = "Priyanashu";
        int n = str.length();
        String ans = "";

        for(int i=0; i<n; i++){
            if(ans.indexOf(str.charAt(i)) == -1){
                ans+=str.charAt(i);
            }else{
                break;
            }
        }
        System.out.println(ans);
    }
}
