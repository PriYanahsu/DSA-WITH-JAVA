import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
    class implement{
        static class Edge{
            int src;
            int des;
    
            public Edge(int s, int d){
                this.src=s;
                this.des=d;
            }
        }
    
        public static void createGraph(ArrayList<Edge> graph[]){
            for (int i = 0; i < graph.length; i++) {
                graph[i] = new ArrayList<Edge>();
            }
    
            graph[0].add(new Edge(0, 1));
            graph[0].add(new Edge(0, 2));
    
            graph[1].add(new Edge(1, 0));
            graph[1].add(new Edge(1, 3));
    
            graph[2].add(new Edge(2, 0));
            graph[2].add(new Edge(2, 4));
    
            graph[3].add(new Edge(3, 1));
            graph[3].add(new Edge(3, 4));
            graph[3].add(new Edge(3, 5));

            graph[4].add(new Edge(4, 2));
            graph[4].add(new Edge(4, 3));
            graph[4].add(new Edge(4, 5));

            graph[5].add(new Edge(5, 3));
            graph[5].add(new Edge(5, 4));
            graph[5].add(new Edge(5, 6));
        }

        public static void bfs(ArrayList<Edge> graph[], int v){     // for BF Transversal
            Queue<Integer> q = new LinkedList<>();
            q.add(0);
            boolean isVisited []= new boolean[v];

            while(!q.isEmpty()){
                int curr = q.remove();
                if(isVisited[curr]==false){
                    System.out.print(curr+ " ");
                    isVisited[curr]=true;
                    for (int i = 0; i < graph[curr].size(); i++) {
                        Edge E = graph[curr].get(i);
                        q.add(E.des);
                    }
                }
            }
        }
    
        public static void main(String args[]){
            int v=7;
            ArrayList<Edge> graph[] = new ArrayList[v];
            createGraph(graph);
    
            // to print 2
            // for (int i = 0; i < graph[2].size(); i++) {
            //     Edge e = graph[2].get(i);
            //     System.out.println(e.des + " , " + e.src+ " , "+ e.wt);
            // }

            bfs(graph, v);
        }
}