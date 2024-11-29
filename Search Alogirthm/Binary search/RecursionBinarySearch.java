public class RecursionBinarySearch{
    public static boolean Binary(int arr[], int target, int si, int ei){
        if(si>ei) return false;

        int mid = (si +(ei - si))/2;
        if(arr[mid] == target){
            return true;
        }
        else if(arr[mid] > target){
            return Binary(arr, target, si, mid-1);
        }
        else{
            return Binary(arr, target, mid+1, ei);
        }
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int target = 5;
        int si = 0;
        int ei = arr.length-1;
        Binary(arr,target,si,ei);
    }
}