public class countSort {
    public static void Sort(int arr[]){
        int n = arr.length;
        int count[] = new int[9];
        int output[] = new int[n];
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i-1];
        }

        for (int i = n-1; i >= 0; i--) {
            int newidx = count[arr[i]] -1;
            output[newidx] = arr[i];
            count[arr[i]]--;
        }

        for(int i = 0; i< output.length; i++){
            arr[i] = output[i];
        }
    }
    
    public static void main(String args[]){
        int arr[] = {5,2,1,4,5,8,3};
        Sort(arr);

        for (int Val : arr) {
            System.out.println(Val);
        }
    }
}
