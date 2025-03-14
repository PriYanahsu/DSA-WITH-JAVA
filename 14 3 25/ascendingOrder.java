public class ascendingOrder {

    public static void main(String arg[]){

        int arr[] = {0,2,2,3,4,7,0,0,1,0,1,0};
        int n = arr.length;

        for(int i=0; i<n; i++){
            int curr = i;
            for(int j=i; j<n; j++){
                if(arr[curr] > arr[j]){
                    curr = j;
                }
            }

            int temp = arr[curr];
            arr[curr] = arr[i];
            arr[i] = temp;
        }

        for(int a : arr){
            System.out.print(a + ", ");
        }
    }
}
