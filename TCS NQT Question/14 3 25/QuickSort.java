public class QuickSort {

    public static void main(String arg[]){

        int arr [] = {1,2,8,5,2,4,7,6};

        int left = 0;
        int right = arr.length-1;
        partition(arr, left, right);

        for(int a : arr){
            System.out.print(a + ", ");
        }
}

    private static void partition(int[] arr, int left, int right) {

        if (left >= right) return;

        int pivotIdx = findPivot(arr, left, right);
        partition(arr, left, pivotIdx - 1);
        partition(arr, pivotIdx + 1, right);
    }

    private static int findPivot(int[] arr, int left, int right) {

        int pivot = arr[left];
        int count = 0;

        for (int i = left + 1; i <= right; i++) {
            if (arr[i] < pivot) count++;
        }
        int pivotIdx = left+count;
        Swap(arr, left, pivotIdx);

        int i=left;
        int j=right;

        while(i<pivotIdx && j>pivotIdx){
            while(i<pivotIdx && arr[i]<arr[pivotIdx]) i++;
            while(j>pivotIdx && arr[j]>arr[pivotIdx]) j--;

            if (i<pivotIdx && j>pivotIdx){
                Swap(arr, i, j);
            }
        }
        return pivotIdx;
    }

    private static void Swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
