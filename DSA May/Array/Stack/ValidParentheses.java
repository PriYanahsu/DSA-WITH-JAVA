package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of String : ");
        String str = sc.next();

        System.out.println(validParentheses(str));
    }

    private static boolean validParentheses(String str) {

        Stack<Character> st = new Stack<>();
        for(char curr : str.toCharArray()){
            if(curr=='(' || curr=='{' || curr=='['){
                st.push(curr);
            }else{
                if(curr==')'){
                    if(st.peek()=='(') st.pop();
                    else return false;
                }
                else if(curr=='}'){
                    if(st.peek()=='{') st.pop();
                    else return false;
                }
                else{
                    if(st.peek()=='[') st.pop();
                    else return false;
                }
            }
        }
        return true;
    }
}