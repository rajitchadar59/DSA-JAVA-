import java.util.*;

public class StronglyConnectedComponent {

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


        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
       

        graph[2].add(new Edge(2, 1));
       

       
        graph[3].add(new Edge(3, 4));
      

    

    }


    public static void topSort(ArrayList<Edge>[] graph ,int curr ,Stack<Integer> s ,boolean vis[]){
        vis[curr]=true;

        for(int i =0 ; i < graph[curr].size() ; i++){
            Edge e= graph[curr].get(i);
            if(!vis[e.dest]){
                topSort(graph, e.dest, s, vis);
            }
        }

        s.push(curr);
    }


    public static void dfs(ArrayList<Edge> transpose[] , int curr , boolean vis[]){
        vis[curr]=true;
        System.out.print(curr+" ");

         for(int i =0 ; i < transpose[curr].size() ; i++){
            Edge e= transpose[curr].get(i);
            if(!vis[e.dest]){
                dfs(transpose, e.dest, vis);
            }
        }

    }


    public static void kosaRaju(ArrayList<Edge>[] graph){

        //  Step 1

           Stack<Integer> s= new Stack<>();
           boolean vis[]= new boolean[graph.length];
           
           for(int i =0 ; i < graph.length ; i++){
            if(!vis[i]){
                topSort(graph, i, s, vis);
            }
           }
        

      //  Step 2

      ArrayList<Edge> transpose[]= new ArrayList[graph.length];

       for (int i = 0; i < graph.length; i++) {
            vis[i]=false;
            transpose[i] = new ArrayList<>();
       }

       for(int i =0 ; i <graph.length ; i++){

        for(int j =0 ; j < graph[i].size() ; j++){
            Edge e= graph[i].get(j);
            transpose[e.dest].add(new Edge (e.dest ,e.src));
        }

       }

       // Step 3

       while(!s.isEmpty()){
        
        int curr=s.pop();
        if(!vis[curr]){
            System.out.print("SCC --> ");
            dfs(transpose, curr, vis);
        }
        System.out.println();
       }



    }

    public static void main(String[] args) {

        int v = 5;
        ArrayList<Edge>[] graph = new ArrayList[v];
        

        createGraph(graph);
        kosaRaju(graph);
        
    }
}
