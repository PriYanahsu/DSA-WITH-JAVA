import java.util.HashMap;
import java.util.Map;
public class Hashmapfreq {
    
    public static void main(String[] args) {
        int arr[] = {2,3,1,5,3,3,3,1};
        Map<Integer, Integer> mp = new HashMap<>();

        for(int val : arr){
            if(!mp.containsKey(val)){
                mp.put(val, 1);
            }
            else{
                mp.put(val, mp.get(val) + 1);
            }
        }

        System.out.println(mp);

        int maxKey = 0, maxVal = 0;
        for(var ele : mp.entrySet()){
            if(ele.getValue() > maxVal){
                maxVal = ele.getValue();
                maxKey = ele.getKey();
            }
        }

        System.out.println(maxKey + " value " + maxVal);
    }
}
