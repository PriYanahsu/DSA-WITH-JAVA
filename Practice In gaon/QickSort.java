public class QickSort {
    public static int pivot(int arr[], int s, int e){
        

        int count = 0;
        for (int i = s + 1; i <= e; i++) {
            if(arr[s] > arr[i]){
                count++;
            }
        }
        int pivotidx = count + s;
        int temp = arr[s];
        arr[s] = arr[pivotidx];
        arr[pivotidx] = temp;

        int x = s;
        int y = e;
        while(x < pivotidx && y > pivotidx){
            while(x < pivotidx && arr[x] <= arr[pivotidx]) x++;
            while(y > pivotidx && arr[y] >= arr[pivotidx]) y--;

            if(x < pivotidx && y > pivotidx){
                int pemp = arr[x];
                arr[x] = arr[y];
                arr[y] = pemp;
            }
        }
        return pivotidx;

    }
    public static void Partition(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        int pivot = pivot(arr, si, ei);
        Partition(arr, si, pivot-1);
        Partition(arr, pivot+1, ei);
    }
    
    public static void main(String args[]){
        int arr[] = {2,1,3,5,4,9,3};
        int s = 0;
        int e = arr.length-1;
        Partition(arr, s, e);
        for(int val: arr){
            System.out.println(val);
        }
    }
}
