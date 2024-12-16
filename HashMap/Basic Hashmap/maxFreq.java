
import java.util.Arrays;

public class maxFreq {
    
    public static void main(String arg[]){
        int arr[] = {2,3,1,5,3,3,3,1};

        Arrays.sort(arr);

        int maxValue = arr[0];
        int maxCount = 1;
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1] == arr[i]){
                count++;
            }
            // else{
            //     maxCount = Math.max(maxCount, count);
            //     count = 1;
            // }
            else{
                if(count>maxCount){
                    maxValue = arr[i-1];
                    maxCount = count;
                }
                count = 1;
            }
        }

        // maxCount = Math.max(maxCount, count);

        if(count>maxCount){
            maxValue = arr[arr.length-1];
            maxCount = count;
        }

        System.out.println(maxValue+ " " + maxCount);
    }
}