public class printArr{
    public static void printAr(int arr[], int idx){
        if(idx == arr.length){
            return;
        }
        System.out.print(arr[idx]+ ", ");
        printAr(arr, idx+1);
    }
    
    public static void main(String arg[]){
        int arr[]= {5,2,4,7,6,3};
        int n = 0;
        printAr(arr, n);
    }
}