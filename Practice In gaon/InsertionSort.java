public class InsertionSort {
    public static void Sort(int arr[]){
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int j = i;
            while(j > 0 && arr[j-1] < arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }

    //     for (int i = 1; i < n; i++) {
    //         int curr = arr[i];

    //         int j = i-1;
    //         while(j>=0 && curr<arr[j]){
    //             arr[j+1] = arr[j];
    //             j--;
    //         }
    //         arr[j+1] = curr;
    //     }
    // }
    
    public static void main(String args[]){
        int arr[] = {5,2,1,4,5,8,3};
        Sort(arr);

        for (int Val : arr) {
            System.out.println(Val);
        }
    }
}
