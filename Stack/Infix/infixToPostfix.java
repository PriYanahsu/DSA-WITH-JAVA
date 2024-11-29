import java.util.Stack;
public class infixToPostfix {
    public static void main(String arg[]){
        Stack<String> var = new Stack<>();
        Stack<Character> op = new Stack<>();

        String str = "9-(5+3)*4/6";

        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            int ascii = (int) curr;

            if(ascii>=48 && ascii<=57){
                String T = "" + curr;
                var.push(T);
            }
            else if(op.isEmpty() || curr == '(' || op.peek()=='('){
                op.push(curr);
            }
            else if(curr == ')'){
                while(op.peek()!='('){
                    String v2 = var.pop();
                    String v1 = var.pop();
                    char o = op.pop();
                    String res = v1 + v2 + o;
                    var.push(res);
                }
                op.pop();
            }
            else{
                if(curr == '+' || curr == '-'){
                    String v2 = var.pop();
                    String v1 = var.pop();
                    char o = op.pop();
                    String res = v1 + v2 + o;
                    var.push(res);
                    op.push(curr);
                }
                if(curr == '*' || curr == '/'){
                    if(op.peek() == '*' || op.peek() == '/'){
                        String v2 = var.pop();
                        String v1 = var.pop();
                        char o = op.pop();
                        String res = v1 + v2 + o;
                        var.push(res);
                        op.push(curr);
                    }
                    else{
                        op.push(curr);
                    }
                }
            }
        }

        while(var.size()>1){
            String v2 = var.pop();
            String v1 = var.pop();
            char o = op.pop();
            String result = v1 + v2 + o;
            var.push(result);
        }

        System.out.println(var.peek());
    }
}
