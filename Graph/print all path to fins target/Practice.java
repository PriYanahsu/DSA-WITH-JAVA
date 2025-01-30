import java.util.ArrayList;
class Practice{
    static class Edge{
        int src;
        int des;

        public Edge(int src, int des){
            this.src=src;
            this.des=des;
        }
    }

    public static void findPath(ArrayList<Edge> graph[], int curr, boolean isVisited[], String str, int target){
        if(curr == target){
            System.out.println(str);
            return;
        }

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!isVisited[e.des]){
                isVisited[curr] = true;
                findPath(graph, e.des, isVisited, str+e.des, target);
                isVisited[curr] = false;
            }
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
    public static void main(String com[]){
        int v = 7; 
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        boolean isVisited[] = new boolean[v];
        int curr = 0;
        int target = 5;
        findPath(graph, curr, isVisited, "", target);
    }
}