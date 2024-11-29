public class Selectionsort{
    static int[] sort(int arr[]){
        int n = arr.length;

        for(int i = 0; i < n; i++){
            int Value = i;
            for(int j = i; j<n ; j++){
                if(arr[Value] > arr[j]){
                    Value = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[Value];
            arr[Value] = temp;
        }
        return arr;
    }

    public static void main(String arg[]){
        int arr[] = {1,5,8,7,4,3};
        int arr2[] = sort(arr);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+ " ");
        }
    }
}