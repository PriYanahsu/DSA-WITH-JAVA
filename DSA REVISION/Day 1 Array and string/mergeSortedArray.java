public class mergeSortedArray {

    public static void main(String man[]){
        int arr1[] = {2,4,5,7,8,9};
        int arr2[] = {1,3,6,10};

        int m = arr1.length;
        int n = arr2.length;
        int idx1 = 0;
        int idx2 = 0;

        int ans[] = new int[m+n];
        int i = 0;

        while(idx1<m && idx2 <n){
            if(arr1[idx1] < arr2[idx2]) ans[i++] = arr1[idx1++];
            else ans[i++] = arr2[idx2++];
        }

        while(idx1<m){
            ans[i++] = arr1[idx1++];
        }

        while(idx2 <n){
            ans[i++] = arr2[idx2++];
        }

        for(int a : ans){
            System.out.print(a + ", ");
        }
    }
}
