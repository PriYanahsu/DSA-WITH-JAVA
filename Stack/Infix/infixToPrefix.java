import java.util.Stack;
public class infixToPrefix{

    public static void infixSolve(String str){

        Stack<String> st = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            int ascii = (int) curr;

            if(ascii >= 48 && ascii <=57){
                String s = "" + curr;
                st.push(s);
            }
            else if(op.isEmpty() || curr == '(' || op.peek() == '(') op.push(curr);
            else if(curr == ')'){
                while(op.peek() != '('){
                    String v2 = st.pop();
                    String v1 = st.pop();
                    char o = op.pop();
                    String res = o + v2 + v1;
                    st.push(res);
                }
                op.pop();    //removing opening brackets
            }
            else{
                if(curr == '+' || curr == '-'){
                    String v2 = st.pop();
                    String v1 = st.pop();
                    char o = op.pop();
                    String res = o + v1 + v2;
                    st.push(res);
                    op.push(curr);
                    }
                    if(curr == '*' || curr == '/'){
                        if(op.peek()=='*' || op.peek()=='/'){
                            String v2 = st.pop();
                            String v1 = st.pop();
                            char o = op.pop();
                            String res = o + v1 + v2;
                            st.push(res);
                            op.push(curr);
                        }
                        else{
                            op.push(curr);
                        }
                    }
                }
            }
            while(st.size()>1){
                String v2 = st.pop();
                String v1 = st.pop();
                char o = op.pop();
                String res = o + v1 + v2;
                st.push(res);
            }
            System.out.println(st.peek());
        }


    public static void main(String args[]){
        String str = "9-(5+3)*4/6";
        infixSolve(str);
    }
}