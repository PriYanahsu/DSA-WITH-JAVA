public class tagetArr {
    static void target(int arr[], int idx, int target){
        if(idx == arr.length){
            System.out.println("Not Found");
            return;
        }
        if(arr[idx] == target){
            System.out.println("Found");
            return;
        }
        target(arr, idx+1, target);
    }
    
    public static void main(String[] args) {
        int arr[] = {2,5,77,66,8};
        int idx = 0;
        int target = 8;
        target(arr, idx, target);
    }
}
