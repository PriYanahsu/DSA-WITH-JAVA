import java.util.Scanner;
import java.util.Stack;

public class ImplimentArray{

    public static void displayRevRec(Stack<Integer> s){
        if(s.size() == 0) return;
        int top = s.pop();
        System.out.print(top +" ");
        displayRevRec(s);
        s.push(top);
    }
    public static void displayRec(Stack<Integer> s){
        if(s.size() == 0) return;
        int top = s.pop();
        displayRevRec(s);
        System.out.print(top +" ");
        s.push(top);
    }

    public static void pushAtBottom(Stack<Integer> s, int element){
        // if(s.size() == 0) {
        //     s.push(element);
        //     return;
        // }

        if(s.isEmpty()) {
            s.push(element);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, element);
        // System.out.print(top +" ");
        s.push(top);
    }

    public static void ReverseStack(Stack<Integer>St){
        
    }

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        st.push(9);
        st.push(10);

        displayRevRec(st);
        System.out.println();

        System.out.println(st);
        pushAtBottom(st, 50);
        System.out.println(st);

        ReverseStack(st);


        // System.out.println(st);
        // displayrevRec(st);
        // System.out.println(st);

        // int n = st.size();
        // int arr[] = new int[n];

        // for (int i = n-1; i >= 0; i--) {
        //     arr[i] = st.pop();
        // }
        
        // for (int i = 0; i < n; i++) {
        //     System.out.print(arr[i]+" ");
        //     st.push(arr[i]);
        // }
    }
}
