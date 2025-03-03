import java.util.ArrayList;
import java.util.List;

public class combinationSum {

    public static void main (String arg[]){

        int arr[] = {1,2,3,4};
        int target = 4;
        List<List<Integer>> ans = new ArrayList<>();

        findCombinationSum(arr, target, 0, ans, new ArrayList<>());

        System.out.println(ans);
    }

    private static void findCombinationSum(int[] arr, int target, int idx, List<List<Integer>> ans, ArrayList<Integer> curr) {

        if(target == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }

        for(int i=idx; i<arr.length; i++){
            if(arr[i] <= target){
                curr.add(arr[i]);
                findCombinationSum(arr, target-arr[i], i, ans, curr);
                curr.remove(curr.size()-1);
            }
        }
    }
}
