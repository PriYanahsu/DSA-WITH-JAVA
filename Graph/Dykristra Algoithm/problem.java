import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class problem {

    public static class Edge {
        int src, des, wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.des = d;
            this.wt = w;
        }
    }

    public static class Pair implements Comparable<Pair> {
        int node, dis;

        public Pair(int n, int d) {
            this.node = n;
            this.dis = d;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.dis - p2.dis;
        }
    }

    public static void main(String arg[]) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 4, 2)); // Fixed out-of-bounds issue
        graph[1].add(new Edge(1, 2, 2));
        graph[1].add(new Edge(1, 0, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 1, 2));
        graph[2].add(new Edge(2, 3, 1));

        graph[3].add(new Edge(3, 2, 1));
        graph[3].add(new Edge(3, 4, 1));

        graph[4].add(new Edge(4, 1, 2));
        graph[4].add(new Edge(4, 3, 1));

        dijkstraAlgorithm(graph, 0, V);
    }

    private static void dijkstraAlgorithm(ArrayList<Edge>[] graph, int src, int v) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int dist[] = new int[v];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0; // Fixed missing initialization

        boolean isVisited[] = new boolean[v];
        pq.add(new Pair(src, 0)); // Fixed incorrect source node addition

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (!isVisited[curr.node]) {
                isVisited[curr.node] = true;

                for (Edge e : graph[curr.node]) {
                    int u = curr.node;
                    int vDest = e.des;

                    if (dist[u] + e.wt < dist[vDest]) {
                        dist[vDest] = dist[u] + e.wt;
                        pq.add(new Pair(vDest, dist[vDest])); // Fixed incorrect priority queue addition
                    }
                }
            }
        }

        System.out.println("Shortest distances from source " + src + ":");
        for (int i = 0; i < dist.length; i++) {
            System.out.println("To node " + i + ": " + (dist[i] == Integer.MAX_VALUE ? "∞" : dist[i]));
        }
    }
}
