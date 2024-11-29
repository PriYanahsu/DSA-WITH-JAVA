public class SelectionSort {
    public static void Sort(int arr[]){
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int small = i;
            for (int j = i; j < n; j++) {
                if(arr[small] > arr[j]){
                    small = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[small];
            arr[small] = temp;
        }
        for (int Val : arr) {
            System.out.println(Val);
        }
    }
    
    public static void main(String args[]){
        int arr[] = {5,2,1,4,5,8,3};
        Sort(arr);
    }
}
