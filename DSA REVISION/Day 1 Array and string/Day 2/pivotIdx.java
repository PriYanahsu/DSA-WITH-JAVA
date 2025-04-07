public class pivotIdx {

    public static void main(String arg[]){
        int arr[] = {1,2,3,4,5,4,3,2,1};

        int n = arr.length;
        int sum = 0;
        int suffix = 0;
        int prefix = 0;

        for(int i=n-1; i>=0; i--){
            sum += arr[i];
        }
        prefix += arr[0];
        for(int i=1; i<n; i++){
            suffix = sum - prefix - arr[i];
            if(prefix == suffix){
                System.out.println("The pivot idx is : "+i);
                return;
            }
            prefix += arr[i];
        }
    }
}
