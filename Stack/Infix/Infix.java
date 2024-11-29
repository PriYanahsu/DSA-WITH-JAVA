import java.util.Stack;
public class Infix{

    public static void infixSolve(String str){

        Stack<Integer> st = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            int ascii = (int) curr;

            if(ascii >= 48 && ascii <=57) st.push(ascii-48);
            else if(op.isEmpty() || curr == '(' || op.peek() == '(') op.push(curr);
            else if(curr == ')'){
                while(op.peek() != '('){
                    int v2 = st.pop();
                    int v1 = st.pop();
                    if(op.peek() == '+')st.push(v1+v2);
                    if(op.peek() == '-')st.push(v1-v2);
                    if(op.peek() == '*')st.push(v1*v2);
                    if(op.peek() == '/')st.push(v1/v2);
                    op.pop();
                }
                op.pop();    //removing opening brackets
            }
            else{
                if(curr == '+' || curr == '-'){
                    int v2 = st.pop();
                    int v1 = st.pop();
                    if(op.peek() == '+')st.push(v1+v2);
                    if(op.peek() == '-')st.push(v1-v2);
                    if(op.peek() == '*')st.push(v1*v2);
                    if(op.peek() == '/')st.push(v1/v2);
                    op.pop();
                    op.push(curr);
                    }
                    if(curr == '*' || curr == '/'){
                        if(op.peek()=='*' || op.peek()=='/'){
                            int v2 = st.pop();
                            int v1 = st.pop();
                            if(op.peek() == '*')st.push(v1*v2);
                            if(op.peek() == '/')st.push(v1/v2);
                            op.pop();
                            op.push(curr);
                        }
                        else{
                            op.push(curr);
                        }
                    }
                }
            }
            while(st.size()>1){
                int v2 = st.pop();
                int v1 = st.pop();
                if(op.peek() == '+')st.push(v1+v2);
                if(op.peek() == '-')st.push(v1-v2);
                if(op.peek() == '*')st.push(v1*v2);
                if(op.peek() == '/')st.push(v1/v2);
                op.pop();
            }
            System.out.println(st.peek());
        }


    public static void main(String args[]){
        String str = "9-(5+3)*4/6";
        infixSolve(str);
    }
}