public class MidBinarySearch{
    public static boolean Binary(int arr[], int target){

        int si = 0;
        int ei = arr.length-1;

        while(si<=ei){
            int mid = si + (ei - si) / 2;
            if(arr[mid] == target){
                return true;
            }
            else if(arr[mid] > target){
                ei = mid-1;
            }
            else{
                si = mid+1;
            }
        }
        return false;
    }

    public static void main(String args[]){
        int arr[] = {2,3,4,8,11};
        int target = 4;
        Binary(arr, target);
    }
}