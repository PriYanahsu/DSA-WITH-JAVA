public class PeakelementMoredata {
    public static int peakForprePost(int arr[]){
        int n = arr.length;

        int st = 0, end = n-1;

        while(st <= end){
            int mid = st + (end - st)/2;
            if(arr[mid] > arr[mid+1]&& arr[mid] > arr[mid-1]){
                return mid;
            }
            if(arr[mid] < arr[mid+1]){
                st = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    

    public static void main(String[] args) {
        int arr[] = {2,1,4,5,7,9,1};

        System.out.println(peakForprePost(arr));
    }
}
