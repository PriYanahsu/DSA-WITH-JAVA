import java.util.*;

public class DykstraAlogo {

    public static class Edge {
        int src, des, weight;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.des = d;
            this.weight = w;
        }
    }

    public static class Pair implements Comparable<Pair> {
        int node, dist;

        public Pair(int n, int d) {
            this.node = n;
            this.dist = d;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.dist - p2.dist;
        }
    }

    public static void dijkstra(ArrayList<Edge>[] graph, int src, int V) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0; // Corrected initialization

        boolean[] isVisi = new boolean[V];
        pq.add(new Pair(src, 0)); // Corrected: Use `src`

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();

            if (!isVisi[curr.node]) {
                isVisi[curr.node] = true;

                for (Edge temp : graph[curr.node]) {
                    int u = temp.src, v = temp.des, w = temp.weight;

                    if (dist[u] + w < dist[v]) {
                        dist[v] = dist[u] + w;
                        pq.add(new Pair(v, dist[v])); // Add only when distance updates
                    }
                }
            }
        }

        // Print shortest distance from source node
        for (int i = 0; i < V; i++) {
            System.out.println("Shortest distance to node " + i + ": " + dist[i]);
        }
    }

    public static void main(String[] args) {
        int n = 6;
        ArrayList<Edge>[] graph = new ArrayList[n];

        // Initialize graph array
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        // Define graph edges
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 3, 1));

        graph[1].add(new Edge(1, 0, 2));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 4, 1));
        graph[2].add(new Edge(2, 5, 2));

        graph[3].add(new Edge(3, 0, 1));
        graph[3].add(new Edge(3, 4, 2));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 2, 2));
        graph[5].add(new Edge(5, 4, 1));

        // Run Dijkstra's algorithm
        dijkstra(graph, 0, n);
    }
}
