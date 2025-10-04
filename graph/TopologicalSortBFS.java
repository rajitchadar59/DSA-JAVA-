import java.util.*;

public class TopologicalSortBFS {

    static class Edge {

        int src;
        int dest;
        

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
          
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        
        graph[5].add(new Edge(5, 0));

        graph[5].add(new Edge(5, 2));
      

        graph[4].add(new Edge(4, 0));
      

        graph[4].add(new Edge(4, 1));


        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));
      


    }

    public static void calIndigree(ArrayList<Edge>[] graph , int indigree[]){

        for(int i =0 ; i < graph.length ; i++){
            
         for(int j =0 ; j < graph[i].size() ; j++){

            Edge e = graph[i].get(j);
              indigree[e.dest]++;

         }
        }

    }
    
    public static void topSort(ArrayList<Edge>[] graph){
        int indigree[]= new int [graph.length];
        calIndigree(graph, indigree);
        Queue<Integer> q= new LinkedList<>();

         for(int i =0 ; i < indigree.length ; i++){
            if(indigree[i]==0){
                q.add(i);
            }
         }


         while(!q.isEmpty()){
            int curr= q.remove();
            System.out.print(curr+" "); // print topological sort 

            for(int i =0 ; i < graph[curr].size() ; i++){
                Edge e= graph[curr].get(i);
                indigree[e.dest]--;

                if(indigree[e.dest]==0){
                    q.add(e.dest);
                }
            }

     
         }

    }
 
    public static void main(String[] args) {


        int v = 6;
        ArrayList<Edge>[] graph = new ArrayList[v];
        

        createGraph(graph);
        topSort(graph);
        
        
    }
}
