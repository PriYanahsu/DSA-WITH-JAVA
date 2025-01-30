import java.util.ArrayList;

class Implement{
    static class Edge{
        int src;
        int des;
        int wt;

        public Edge(int s, int d, int w){
            this.src=s;
            this.des=d;
            this.wt=w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 2, -1));

        graph[1].add(new Edge(1, 3, 1));
        graph[1].add(new Edge(1, 2, 5));

        graph[2].add(new Edge(2, 0, -1));
        graph[2].add(new Edge(2, 1, 5));
        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 2, 2));
        graph[3].add(new Edge(3, 1, 1));

    }

    public static void main(String args[]){
        int v=4;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);

        // to print 2
        for (int i = 0; i < graph[2].size(); i++) {
            Edge e = graph[2].get(i);
            System.out.println(e.des + " , " + e.src+ " , "+ e.wt);
        }
    }
}