public class chocolateNumber{
    public static boolean findVal( int arr[],int maxChoco, int number){
        int numberOfStudent = 1;
        int choco = 0;

        for (int i = 0; i < arr.length; i++) {
            if(maxChoco < arr[i]) return false;
            if(choco + arr[i] <= maxChoco){
                choco += arr[i];
            }
            else{
                numberOfStudent++;
                choco = arr[i];
            }
        }
        if(numberOfStudent > number) return false;
        return true;
    }

    public static int searhMid(int arr[], int number){
        if(arr.length < number) return -1;

        int ans = 0;
        int start = 0; int end =(int) 1e9;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(findVal( arr,mid, number)){
                ans = mid;
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String args[]){
        int arr[] = {12,34,67,90};
        int number = 2;
        System.out.println(searhMid(arr, number));
    }
}