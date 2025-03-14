public class siftZero {

    public static void main(String arg[]){

        int arr[] = {2,3,5,0,4,7,0,5,8,0};
        int n = arr.length;

        int idx = 0;
        for(int i=0; i<n; i++){
            if(arr[i] != 0){
                arr[idx++] = arr[i];
            }
        }

        while(idx < n){
            arr[idx++] = 0;
        }

        for(int a : arr){
            System.out.print(a + ", ");
        }
    }
}
