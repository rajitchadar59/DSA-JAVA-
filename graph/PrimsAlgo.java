
import java.util.*;

public class PrimsAlgo {

    static class Edge {

        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }


        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30)); 
       
        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));


        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3 ,1 ,40));
        graph[3].add(new Edge(3 ,2 ,50));

    }

    static class Pair{

        int v;
        int cost;

        Pair(int v , int cost){
            this.v=v;
            this.cost=cost;
        }

    }

    public static void prims( ArrayList<Edge>[] graph ){
      boolean visited[] = new boolean[graph.length];
      PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.cost-b.cost);

      pq.add(new Pair(0,0));
      int finalcost=0;

      while(!pq.isEmpty()){
        Pair curr= pq.remove();
        if(!visited[curr.v]){
           visited[curr.v]=true;
           finalcost+=curr.cost;

           for(int i =0 ; i < graph[curr.v].size() ; i++){
            Edge e= graph[curr.v].get(i);
            pq.add(new Pair(e.dest ,e.wt));
           }


        }
      }

     System.out.println(" total minimum  cost of (MST): " + finalcost);

    }


   
    
    public static void main(String[] args) {

        int v = 4;
        ArrayList<Edge>[] graph = new ArrayList[v];
        

        createGraph(graph);
        prims(graph);
        
      

    }
}
