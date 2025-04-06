public class kadaneAlgorithm {

    public static void main (String arg[]){
        int arr[] = {-1,-2,-9,2,4,-10};
        int n = arr.length;

        int sum = arr[0];
        int max = arr[0];

        for(int i=1; i<n; i++){

            sum = Math.max(arr[i], sum+arr[i]);
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}
