public class slidingWindow {

    public static void main(String arg[]){
        int arr[] = {30,40,50,20,20,10,90,10,10,10};
        int target = 100;
        int val = findMaxLength(arr, target);
        System.out.println(val);
    }

    private static int findMaxLength(int[] arr, int target) {

        int n = arr.length;
        int start = 0;
        int end = 0;
        int ans = 0;
        int maxLength = 0;

        while(end < n){
            ans += arr[end++];
            if(ans < target){
                maxLength = Math.max(maxLength, end-start);
            }else{
                ans -= arr[start++];
            }
        }
        return maxLength;
    }
}
