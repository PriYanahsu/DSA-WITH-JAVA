
import java.util.ArrayList;
import java.util.HashMap;

public class Practice{
    public static ArrayList<Integer> findTwoSum(int arr[], int target){

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        int secondVal = 0;
        for (int i = 0; i < arr.length; i++) {
            secondVal = target - arr[i];

            if(!map.containsKey(secondVal)){
                map.put(arr[i], i);
            }
            else{
                list.add(i);
                list.add(map.get(secondVal));
            }
        }
        return list;
    }

    public static void main(String arg[]){
        int arr[] = {0,-1,2,-3,1};
        int target = -2;

        System.out.println(findTwoSum(arr, target));

    }
}