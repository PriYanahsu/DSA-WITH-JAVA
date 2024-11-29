public class turtleArr{
    public static int Turtle(int arr[], int n, int idx){
        if(idx == n-1) return 0;

        int option1 = Turtle(arr, n, idx+1) + Math.abs(arr[idx] - arr[idx+1]);
        if(idx == n-2) return option1;
        int option2 = Turtle(arr, n, idx+2) + Math.abs(arr[idx] - arr[idx+2]);
        return Math.min(option1, option2);
    }

    public static void main(String arg[]){
        int arr [] = {10, 30, 40, 20};
        int n = 4;
        int idx = 0;
        System.out.println(Turtle(arr, n, idx));
    }
}