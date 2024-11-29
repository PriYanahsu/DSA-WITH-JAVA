public class PivotIdx{
    public static int Idx(int arr[]){

        int n = arr.length;
        int si = 0;
        int ei = n-1;
        int ans = -1;

        while(si<=ei){
            int mid = si + (ei-si)/2;
            if(arr[mid] > arr[n-1]){
                si = mid+1;
            }
            else if(arr[mid] < arr[n-1]){
                ans = mid;
                ei = mid-1;
            }
        }
        return ans;
    }

    public static void main(String args[]){
        int arr[] = {4,5,1,2,3};
        System.out.println(Idx(arr));
    }
}