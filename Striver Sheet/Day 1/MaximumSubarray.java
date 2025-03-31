public class MaximumSubarray {

    public static void main (String arg[]){

        int arr [] = {-2,1,-3,4,-1,2,1,-5,4};

        int n = arr.length;
        int maxValue = Integer.MIN_VALUE;
        int sum = 0;
        int startIDX = 0;
        int endIDX = 0;

        for(int i=0; i<n; i++){
            sum += arr[i];

            if(maxValue < sum){
                maxValue = sum;
                endIDX = i;

            } else if (sum < 0) {
                sum = 0;
                startIDX = i+1;
            }
        }

        System.out.println(maxValue + " From index " + startIDX + " to " + endIDX);
    }
}
