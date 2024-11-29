public class insertionSort{
    public static int[] sort(int arr[]){
        int n = arr.length;

        for(int i = 1; i<n; i++){
            int curr = arr[i];  //unsorted array

            int j = i-1;
            while(j >= 0 && curr < arr[j]){     // sorted array
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
        }
        return arr;
    }

    public static void main(String arg[]){
        int arr[] = {5,2,4,7,6,1};
        int arr2[]= sort(arr);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}