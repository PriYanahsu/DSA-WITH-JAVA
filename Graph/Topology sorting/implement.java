import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class implement {

    public static void toplogyUtil(List<List<Integer>> graph, int curr, boolean[] isVisi, Stack<Integer> st) {
        isVisi[curr] = true;

        for (int val : graph.get(curr)) {
            if (!isVisi[val]) {
                toplogyUtil(graph, val, isVisi, st);
            }
        }
        st.push(curr);
    }

    public static void toplogy(List<List<Integer>> graph, boolean[] isVisi, int node) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < node; i++) {
            if (!isVisi[i]) {
                toplogyUtil(graph, i, isVisi, st);
            }
        }

        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int node = sc.nextInt();
        int edge = sc.nextInt();

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < node; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < edge; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.get(u).add(v);  // Directed edge from u to v
        }

        boolean[] isVisi = new boolean[node];

        toplogy(graph, isVisi, node);
        sc.close();
    }
}
