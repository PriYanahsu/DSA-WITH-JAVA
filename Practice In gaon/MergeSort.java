public class MergeSort {
    public static void conquer(int arr[], int si, int mid, int ei){
        int n = arr.length;
        int merge[] = new int[ei-si+1];

        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;

        while(idx1 <= mid && idx2 <= ei ){
            if(arr[idx1] <= arr[idx2]){
                merge[x++] = arr[idx1++];
            }
            else{
                merge[x++] = arr[idx2++];
            }
        }
        while(idx1 <= mid){
            merge[x++] = arr[idx1++];
        }
        while(idx2 <= ei){
            merge[x++] = arr[idx2++];
        }

        for(int i = 0; i < merge.length; i++) {
            arr[si + i] = merge[i];
        }
        
    }

    public static void Sortdivide(int arr[], int si, int ei) {
        if(si>=ei){
            return;
        }
        int mid = si + (ei - si)/2;

        Sortdivide(arr, si, mid);
        Sortdivide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
    }
    
    
    public static void main(String args[]){
        int arr[] = {5,2,1,4,5,8,3};
        int si = 0;
        int ei = arr.length-1;
        Sortdivide(arr, si, ei);

        for (int Val : arr) {
            System.out.println(Val);
        }
    }
}
