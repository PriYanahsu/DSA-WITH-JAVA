import java.util.HashMap;
import java.util.Map;

public class findMajority {

    public static void main(String arg []){
        int [] arr = {1,2,3,5,7,8,5,7,5,2,1,5,2,5,4,1,6,3,5};

        System.out.println(findMaxRepeat(arr));

    }

    public static int findMaxRepeat(int[] arr) {

        Map <Integer, Integer>map = new HashMap<>();

        int n = arr.length;

        for(int i=0; i<n; i++){
            int curr = arr[i];
            map.put(curr, map.getOrDefault(curr, 0) + 1);
        }

        int max = -1;
        int ans = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(max < entry.getValue()){
                max = entry.getValue();
                ans = entry.getKey();
            }
        }
        return ans;
    }
}
