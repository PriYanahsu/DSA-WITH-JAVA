import java.util.Stack;
public class indisesDistanceBetween{
    public static int[] FindIndices(int arr[], int n){
        Stack <Integer> st = new Stack<>();
        int result[] = new int[n];

        for (int i = 0; i < n; i++) {
            while(!st.isEmpty() && arr[st.peek()] < arr[i]){   //only indices are in pop or push in stack
                st.pop();
            }
            if(st.isEmpty()){
                result[i] = 1;
                st.push(i);
            } 
            else if(arr[st.peek()] > arr[i]){
                int temp = i - st.peek();
                result[i] = temp;
            }
            st.push(i);
        }
        return result;
    }

    public static void main(String args[]){
        int arr[] = {100,80,60,70,60,75,85};
        int n = 7;

        int Result [] = FindIndices(arr, n);

        for (int i = 0; i < Result.length; i++) {
            System.out.print(Result[i]+ " ");
        }
    }
}