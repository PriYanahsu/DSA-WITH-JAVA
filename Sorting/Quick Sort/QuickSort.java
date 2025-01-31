public class QuickSort{
    public static void Swap(int arr[], int I, int J){
        
        int temp = arr[I];
        arr[I] = arr[J];
        arr[J] = temp;
    }

    public static int pivot(int arr[], int si, int ei){
        int count = 0;
        for (int i = si + 1 ; i <= ei; i++) {
            if(arr[si] > arr[i]){
                count++;
            }
        }
        int pivotidx = si + count;
        Swap(arr, pivotidx, si);

        int i = si;
        int j = ei;
        while (i < pivotidx && j > pivotidx) {
            while (i < pivotidx && arr[i] <= arr[pivotidx]) i++;
            while (j > pivotidx && arr[j] >= arr[pivotidx]) j--;
            if (i < pivotidx && j > pivotidx) {
                Swap(arr, i, j);
            }
        }
        return pivotidx;
    }

    public static void Partition(int arr[], int si, int ei){
        if(si >= ei) return;

        int pivot = pivot(arr, si, ei);
        Partition(arr, si, pivot-1);
        Partition(arr, pivot+1, ei);
    }
    
    public static void main(String args[]){
        int arr[] = {5,3,2,1,4};
        int si = 0;
        int ei = arr.length-1;
        Partition(arr, si, ei);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}


// public static void Partition (int arr[], int i, int j){

//     if(i>=j)return;

//     int pivot = pivot(arr, i, j);
//     partition(arr, i, pivot-1);
//     partition(arr, pivot+1, j);
// }

// public static int pivot(int arr[], int start, int end){

//     int count = 0;

//     for(int i=start+1; i<=end; i++){
//         if(arr[start]>arr[i]) count++;
//     }

//     int pivotIdx = count + start;
//     swap(arr, pivotIdx, start);
    
//     int i=start;
//     int j=end;

//     while(i<pivotIdx && j>pivotIdx){
//         while(i<pivotIdx && arr[i] < arr[pivotIdx])i++;
//         while(j>pivotIdx && arr[j] > arr[pivotIdx])j--;
//         if(i<pivotIdx && j>pivotIdx) swap(arr, i, j);
//     }
//     return pivotIdx;
// }
    



























    
