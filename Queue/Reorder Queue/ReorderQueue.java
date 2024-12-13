import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReorderQueue{

    public static void main (String args[]){
        Stack<Integer> st = new Stack<>();
        Queue<Integer> qt1 = new LinkedList<>();
        qt1.add(1);
        qt1.add(2);
        qt1.add(3);
        qt1.add(4);
        qt1.add(5);
        qt1.add(6);

        int n = qt1.size();

        for (int i = 1; i <= n/2; i++) {
            st.push(qt1.remove());
        }

        while(!st.isEmpty()){
            qt1.add(st.pop());
        }

        for (int i = 1; i <= n/2; i++) {
            st.push(qt1.remove());
        }

        while(!st.isEmpty()){
            qt1.add(st.pop());
            qt1.add(qt1.remove());
        }

        while(!qt1.isEmpty()){
            st.push(qt1.remove());
        }

        while(!st.isEmpty()){
            qt1.add(st.pop());
        }
        System.out.println(qt1);


    }
}
