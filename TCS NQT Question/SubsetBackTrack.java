import java.util.ArrayList;
import java.util.List;

public class SubsetBackTrack {


    public static void main(String arg[]){

        int nums[] = {1, 2, 3};
        List<List<Integer>> ans = new ArrayList<>();

        findSubset(ans , new ArrayList<>(), nums, 0);

        System.out.println(ans);

    }

    private static void findSubset(List<List<Integer>> ans, ArrayList<Integer> curr, int[] nums, int idx) {

         ans.add(new ArrayList<>(curr));

        for(int i=idx; i<nums.length; i++){
            curr.add(nums[i]);
            findSubset(ans, curr, nums, i+1);
            curr.remove(curr.size()-1);
        }
    }
}
