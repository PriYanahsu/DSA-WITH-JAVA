public class SearchForTarget {
    public static int search(int arr[], int target){
        int s = 0;
        int n = arr.length-1;
        int e = n;

        while(s <= e){
            int mid =  s + (e-s) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < arr[e]){
                if(target > arr[mid] && target <= arr[e]){
                    s = mid+1;
                }else{
                    e = mid -1;
                }
            }else{
                if(target <= arr[mid] && target >= arr[s]){
                    e = mid - 1;
                }else{
                    s = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main (String args[]){
        int arr[] = {5,6,7,8,1,2,5,4};
        int target = 8;
        System.out.println(search(arr,target));
    }
}
