import java.util.Scanner;
import java.util.Stack;
public class InsertionAtbottom {

    public static void addBottom(Stack<Integer> st, int element){
        if(st.isEmpty()){
            st.push(element);
            return;
        }

        int top = st.pop();
        addBottom(st, element);
        st.push(top);
    }
    
    public static void reverseStack(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }

        int top = st.pop();
        reverseStack(st);
        addBottom(st, top);
    }

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        st.push(9);

        System.out.println(st);
        reverseStack(st);
        System.out.println(st);
    }
}
