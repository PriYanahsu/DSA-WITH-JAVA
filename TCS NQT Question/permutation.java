import java.util.ArrayList;
import java.util.List;

public class permutation {

    public static void main(String arg[]){

        int arr[] = {1,2,3};

        List<List<Integer>> ans = new ArrayList<>();
        boolean isVisited[] = new boolean[arr.length];

        findAllPermutation(ans, new ArrayList<>(), isVisited, arr);

        System.out.println(ans);
    }

    private static void findAllPermutation(List<List<Integer>> ans, ArrayList<Integer> curr, boolean[] isVisited, int[] arr) {

        if(curr.size() == arr.length){
            ans.add(new ArrayList<>(curr));
            return;
        }

        for(int i=0; i<arr.length; i++){
            if(!isVisited[i]){
                isVisited[i] = true;
                curr.add(arr[i]);
                findAllPermutation(ans,curr,isVisited, arr);
                isVisited[i] = false;
                curr.remove(curr.size()-1);
            }
        }
    }
}
