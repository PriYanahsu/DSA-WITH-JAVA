import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class implement{
    public static class Edge{
        int src;
        int dest;

        Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    public static void bfs(ArrayList<Edge> [] graph, int curr, int v){

        Queue<Integer> q = new LinkedList<>();
        boolean isVisited[] = new boolean[v];
        q.add(curr);

        while(!q.isEmpty()){
            int val = q.remove();
            if(!isVisited[val]){
                System.out.print(val +" ");
                isVisited[val] = true;

                for (int i = 0; i < graph[val].size(); i++) {
                    Edge e = graph[val].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void main(String arg[]){
        int v = 2;
        ArrayList<Edge> [] graph = new ArrayList[v];

        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));

        graph[1].add(new Edge(1, 0));

        bfs(graph, 0, v);

    }
}