import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Prctice {

    // Renamed `pair` to `Pair` for better naming convention.
    class Pair {
        int first, second;

        Pair(int f, int s) {
            first = f;
            second = s;
        }
    }

    List<List<Integer>> returnVal(int arr[]) {
        int n = arr.length;
        HashMap<Integer, Pair> map = new HashMap<>();
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = arr[i] + arr[j];

                if (!map.containsKey(sum)) {
                    map.put(sum, new Pair(i, j));
                } else {
                    Pair p = map.get(sum);
                    // Create sublists to store pairs of indices or values.
                    List<Integer> tempList1 = new ArrayList<>();
                    tempList1.add(arr[p.first]);
                    tempList1.add(arr[p.second]);
                    list.add(tempList1);

                    List<Integer> tempList2 = new ArrayList<>();
                    tempList2.add(arr[i]);
                    tempList2.add(arr[j]);
                    list.add(tempList2);
                }
            }
        }
        return list;
    }

    public static void main(String arg[]) {
        int arr[] = {3, 4, 7, 1, 2, 9, 8};
        Prctice p = new Prctice();
        List<List<Integer>> result = p.returnVal(arr);

        // Print the results
        for (List<Integer> pair : result) {
            System.out.println(pair);
        }
    }
}
