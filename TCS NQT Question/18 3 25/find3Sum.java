import java.util.*;

public class find3Sum {

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        int arr[] = {-1, 0, -1, 2, 3, -2};

        Set <List<Integer>> set = new HashSet<>();

        List<Integer> curr = new ArrayList<>();
        findAllPossible(arr, set, curr, 0);

        System.out.println(set.toString());
    }

    private static void findAllPossible(int[] arr, Set<List<Integer>> set, List<Integer> curr, int idx) {

        if(curr.size() == 3){
            if(curr.get(0) + curr.get(1) + curr.get(2) == 0){
                set.add(new ArrayList<>(curr));
                return;
            }
        }

        for(int i=idx; i<arr.length; i++){
            curr.add(arr[i]);
            findAllPossible(arr, set, curr, i+1);
            curr.remove(curr.size()-1);
        }
    }
}
