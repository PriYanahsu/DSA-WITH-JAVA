public class SubsequenceAdd {
    public static void Subseq(int arr[], int n, int sum, int idx){
        if(idx == n){
            System.out.println(sum);
            return;
        }

        Subseq(arr, n, sum, idx+1);
        Subseq(arr, n, sum + arr[idx], idx+1);
    }
    
    public static void main(String arg[]){
        int arr[] = {1,2,3};
        int n = arr.length;
        int sum = 0;
        int idx = 0;
        Subseq(arr, n, sum, idx);
    }
}
