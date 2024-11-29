import java.util.Stack;

public class Conversion{

    public static void main(String arg[]){
        Stack<String> st = new Stack<>();
        String str = "-9/*+5346";

        for(int i=str.length()-1; i>=0; i--){
            char curr = str.charAt(i);
            int ascii = (int) curr;

            if(ascii>=48 && ascii<=57){
                String t = ""+curr;
                st.push(t);
            }
            else {
                if(curr == '+' || curr == '-' || curr == '*'|| curr == '/'){
                    String val1 = st.pop();
                    String val2 = st.pop();

                    if(curr == '+') st.push(val1+val2+curr);
                    if(curr == '-') st.push(val1+val2+curr);
                    if(curr == '*') st.push(val1+val2+curr);
                    if(curr == '/') st.push(val1+val2+curr);
                }
            }
        }
        System.out.println(st.peek());
    }
}