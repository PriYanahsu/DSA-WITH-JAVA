public class sumArr {
    public static int sum = 0;
    static void sum(int arr[], int idx){
        if(idx == arr.length){
            System.out.println(sum);
            return;
        }

        sum += arr[idx];
        sum(arr, idx+1);
    }
    
    public static void main(String arg[]){
        int arr[] = {1,2,3,4,5};
        int idx = 0;
        sum(arr, idx);
    }
}
