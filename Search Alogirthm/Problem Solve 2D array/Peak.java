public class Peak {
    public static int Find(int arr[]){

        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start) / 2;
            if((mid == 0 || arr[mid] > arr[mid-1]) && (mid == arr.length-1 || arr[mid] > arr[mid+1])){
                return mid;
            }
            else if(arr[mid] < arr[mid+1]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,1};
        System.out.println(Find(arr));
    }
}
