import java.util.Stack;

public class EvaluatePostFix{

    public static void main(String arg[]){
        String str = "953+4*6/-";  // 
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<str.length();i++){
            char curr = str.charAt(i);
            int ascii = (int) curr;

            if(ascii>=48 && ascii<=57){
                st.push(ascii-48);
            }
            else if(curr == '+' || curr == '-' || curr == '*' || curr == '/'){
                int val2 = st.pop();
                int val1 = st.pop();

                if(curr == '+') st.push(val1+val2);
                if(curr == '-') st.push(val1-val2);
                if(curr == '*') st.push(val1*val2);
                if(curr == '/') st.push(val1/val2);
            }
        }
        System.out.println(st.peek());
    }
}