public class bubbleSort{
    public static void Sort(int arr[]){
        int n = arr.length;

        for(int i = 0; i<n-1; i++){
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int Val : arr){
            System.out.println(Val);
        }
    }
    public static void main(String args[]){
        int arr[] = {5,2,1,4,5,8,3};
        Sort(arr);
    }
}