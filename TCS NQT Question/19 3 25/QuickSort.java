public class QuickSort {

    public static void main(String arg[]){
        int arr[] = {2,8,7,1,5,6,3,4,5};

        pertition(arr,0, arr.length-1);

        for(int a : arr){
            System.out.print(a + ", ");
        }
    }

    private static void pertition(int[] arr, int left, int right) {

        if(left >= right) return;

        int pivot = finPivot(arr, left, right);
        pertition(arr, left, pivot-1);
        pertition(arr, pivot+1, right);
    }

    private static int finPivot(int[] arr, int left, int right) {

        int pivot = arr[left];
        int count = 0;
        for(int i=left+1; i<=right; i++){
            if(pivot > arr[i]) count++;
        }

        int pivotIdx = left + count;
        Swap(arr, left, pivotIdx);

        int i = left;
        int j = right;
        while(i < pivotIdx && j > pivotIdx){
            while(i < pivotIdx && arr[i] < pivot) i++;
            while(j > pivotIdx && arr[j] > pivot) j--;

            if(i < pivotIdx && j > pivotIdx){
                Swap(arr, i, j);
            }
        }
        return pivotIdx;
    }

    private static void Swap(int[] arr, int left, int pivotIdx) {

        int temp = arr[left];
        arr[left] = arr[pivotIdx];
        arr[pivotIdx] = temp;
    }
}
