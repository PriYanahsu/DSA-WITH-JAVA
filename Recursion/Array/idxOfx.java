public class idxOfx {
    static void idxx(int arr[], int idx, int x){
        if(idx == arr.length){
            return;
        }

        if(arr[idx] == x){
            System.out.println(idx);
        }
        idxx(arr, idx+1, x);
    }
    

    public static void main(String[] args) {
        int arr[] = {1,2,5,2,4,2};
        int n = 0;
        int x = 2;
        idxx(arr, n, x);
    }
}
