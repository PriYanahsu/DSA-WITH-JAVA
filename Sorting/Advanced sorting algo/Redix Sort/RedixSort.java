
public class RedixSort{
    static int Max(int arr[]){
        int max =Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    public static void Redix(int[]arr){

        int max = Max(arr);
        for(int place= 1; max/place >0; place *= 10){
            countSort(arr,place);
        }
    }

    static void countSort(int arr[], int place){
        int n = arr.length;
        int count[] = new int[10];
        int output[] = new int[n];

        for (int i = 0; i < n; i++) {
            count[(arr[i] / place) % 10]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i-1];
        }

        for (int i = n-1; i >= 0; i--) {
            int NewIdx = count[(arr[i] / place) % 10] - 1;
            output[NewIdx] = arr[i];
            count[(arr[i] / place) % 10]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    public static void main(String arg[]){
        int arr[] = {545,312,22,40,55,8,595};
        Redix(arr);

        for(int val: arr){
            System.out.println(val);
        }
    }
}