import java.util.ArrayList;
import java.util.Scanner;

class ImplementDFS{

    public static void DfsImple(ArrayList<ArrayList<Integer>> graph, int curr,  boolean isVisited[]){
        System.out.print(curr + " ");
        isVisited[curr] = true;

        for(int negh : graph.get(curr)){
            if(!isVisited[negh]){
                DfsImple(graph, negh, isVisited);
            }
        }
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int m = 2;
        int n = 4;

        int arr[][] = new int[m][n];
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<n; i++){
            graph.add(new ArrayList<>());
        }

        for(int [] edge : arr){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        boolean isVisited[] = new boolean[n];

        DfsImple(graph, 0, isVisited);

    }
}