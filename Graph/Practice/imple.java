import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class imple {

    public static void Bfs(int[][] arr, int curr, int size) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : arr) {  // Fixed loop variable name
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        boolean isVisited[] = new boolean[size];  // Fixed boolean array initialization
        Queue <Integer> q = new LinkedList<>();
        q.add(curr);

        while(!q.isEmpty()){
            int val = q.remove();
            isVisited[val] = true;
            System.out.print(val + " ");

            for (int neigh : graph.get(val)) {
                if(!isVisited[neigh]){
                    isVisited[neigh]=true;
                    q.add(neigh);
                }
            }
        }
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        int m = 4, n = 2;
        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {  // Fixed loop bounds
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        Bfs(arr, arr[0][0], m);  // Fixed incorrect size argument
        sc.close();
    }
}
