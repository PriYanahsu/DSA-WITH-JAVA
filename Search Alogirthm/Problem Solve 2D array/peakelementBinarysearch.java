public class peakelementBinarysearch {

    public static int Peak(int arr[]){

        int st = 0;
        int end = arr.length-1;

        int peek = -1;

        while(st <= end){
            int mid = st + (end-st)/2;
            if(arr[mid] < arr[mid+1]){
                peek = mid+1;
                st = mid+1;
            }else{
                end = mid-1;
            }
        }
        
        return peek;
    }
    

    public static void main(String[] args) {
        int arr[] = {0,1,5,12,20,1,0};
        System.out.println(Peak(arr));
    }
}
