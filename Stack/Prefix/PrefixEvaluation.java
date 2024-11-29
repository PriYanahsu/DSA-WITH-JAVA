import java.util.Stack;

public class PrefixEvaluation{

    public static void main(String arg[]){
        String str = "-+53/42";  //5+3-4/2
        Stack<Integer> st = new Stack<>();

        for(int i=str.length()-1; i>=0;i--){
            char curr = str.charAt(i);
            int ascii = (int) curr;

            if(ascii>=48 && ascii<=57){
                st.push(ascii-48);
            }
            else if(curr == '+' || curr == '-' || curr == '*' || curr == '/'){
                int val1 = st.pop();
                int val2 = st.pop();

                if(curr == '+') st.push(val1+val2);
                if(curr == '-') st.push(val1-val2);
                if(curr == '*') st.push(val1*val2);
                if(curr == '/') st.push(val1/val2);
            }
        }
        System.out.println(st.peek());
    }
}