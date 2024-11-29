public class maxValArr {
    static void maxVal(int arr[], int idx, int max){
        if (idx == arr.length){
            System.out.println(max);
            return;
        }

            if(max < arr[idx]){
                max = arr[idx];
            }

        maxVal(arr, idx+1, max);
    }
    
    public static void main(String arg[]){
        int arr [] = {1,25,7,9};
        int n = 0;
        maxVal(arr, n,0);
    }
}
