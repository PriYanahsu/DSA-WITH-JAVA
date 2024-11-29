public class WithoutIdxrecursion {

        public static void StringRev(String str, String rev){
            if(str.length()==0){
                System.out.println(rev);
                return;
            }
    
            char curr = str.charAt(0);
            String newString = str.substring(1);
            StringRev(newString, curr+rev);
        }
        public static void main(String[] args) {
            String str = "abc";
            String rev = "";
            StringRev(str, rev);
        }
    }
