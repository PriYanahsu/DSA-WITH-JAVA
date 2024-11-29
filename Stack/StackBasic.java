import java.util.Scanner;
import java.util.Stack;

public class StackBasic{

    public static void main(String args[]){
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        Stack<Integer> gt = new Stack<>();

        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        while(st.size() > 0){
            gt.push(st.pop());
        }
        System.out.print(gt);
    }
}