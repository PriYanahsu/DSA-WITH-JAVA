public class PositiveNegSwap {
    
    public static void pivotZero(int arr[],int start, int end){

        while(start < end){
            while(start < end && arr[start] < 0)start++;
            while(start < end && arr[end] > 0)end--;

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for(int val: arr){
            System.out.print(val+ " ");
        }
    }
    public static void main(String args[]){
        int arr[] = {-4,4,2,-3,3,5,-5,6,-6};
        int start = 0;
        int end = arr.length-1;
        pivotZero(arr,start,end);

        
    }
}
