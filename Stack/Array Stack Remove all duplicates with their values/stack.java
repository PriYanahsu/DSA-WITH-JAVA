// Input  {1,2,4,4,4,10,10,10,3}
// Output {1,2,3}
import java.util.Stack;
public class stack{

    public static int[] RemoveDuplicates(int arr[]){
        Stack<Integer> st = new Stack<Integer>();
        for(int i=0; i<arr.length; i++){
            if(st.size() == 0 || st.peek() != arr[i]){
                st.push(arr[i]);
            }
            else if(st.peek() == arr[i]){
                if(i == arr.length-1 || arr[i] != arr[i+1]){
                    st.pop();
                }
            }
        }
        int result[] = new int[st.size()];

        for (int i = result.length-1; i >= 0; i--) {
            result[i] = st.pop();
        }
        return result;
    }

    public static void main(String arg[]){
        int arr[] = {1,2,4,4,4,10,10,10,3};
        int result[] = RemoveDuplicates(arr);

        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+ " ");
        }
    }
}