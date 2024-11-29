import java.util.Stack;

public class Converter{

    public static void main(String [] args){
        Stack<String> st = new Stack<>();
        String str = "953+4*6/-";

        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            int ascii = (int) curr;

            if(ascii >= 48 && ascii <= 57){
                String t = ""+curr;
                st.push(t);
            }
            else{
                if(curr=='+' || curr=='-' || curr=='*' || curr=='/'){
                    String v2 = st.pop();
                    String v1 = st.pop();

                    if(curr=='+') st.push(curr + v1 + v2);
                    if(curr=='-') st.push(curr + v1 + v2);
                    if(curr=='*') st.push(curr + v1 + v2);
                    if(curr=='/') st.push(curr + v1 + v2);
                }
            }
        }
        System.out.println("The prefix expression is "+ st.peek());
    }
}