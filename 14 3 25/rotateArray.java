public class rotateArray {


    public static void main(String arg[]){

        int arr [] = {1,2,3,4,5};
        int n = 2;

        rotateArr(arr,n);

        for(int i=0 ;i<arr.length; i++){
            System.out.print(arr[i]+", ");
        }
    }

    private static void rotateArr(int[] arr, int k) {

        int ans [] = new int[arr.length];
        int n = arr.length;
        for(int i=0; i<n; i++){
            ans[(i+k)%n] = arr[i];
        }

        for(int i=0; i<ans.length; i++){
            arr[i] = ans[i];
        }
    }
}
