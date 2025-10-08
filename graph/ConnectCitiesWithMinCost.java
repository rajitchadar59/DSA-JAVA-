import java.util.ArrayList;
import java.util.PriorityQueue;


public class ConnectCitiesWithMinCost {

    static class Edge {
        int src;
        int dest;
        int wt;

        Edge(int s , int d , int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }

        
    }

    static class Pair{
        int v;
        int cost;

         Pair(int v ,int c){
            this.v=v;
             this.cost=c;

         }
    }

    public static int connectCities(ArrayList<Edge> graph[]){
        PriorityQueue<Pair> pq= new PriorityQueue<>((a,b)->a.cost-b.cost);
        boolean visited[]= new boolean[graph.length];
        int finalcost=0;
        pq.add(new Pair(0,0));

        while(!pq.isEmpty()){
            Pair curr= pq.remove();
            if(!visited[curr.v]){
             
             visited[curr.v]=true;
             finalcost+=curr.cost;
            
            for(int i =0 ; i < graph[curr.v].size() ; i++){
                  Edge e= graph[curr.v].get(i);
                  pq.add(new Pair(e.dest , e.wt));
            }

            }
        }
        return finalcost;
    }
    public static void main(String[] args) {

       int cities[][]={
        {0,1,2,3,4},
        {1,0,5,0,7},
        {2,5,0,6,0},
        {3,0,6,0,0},
        {4,7,0,0,0}
       };
         
       ArrayList<Edge> graph[]=new ArrayList[cities.length]; 

       for(int i =0 ; i < graph.length ; i++){
        graph[i]= new ArrayList<>();
       }

       for(int i =0 ; i < cities.length ; i++){
        for(int j=0 ; j < cities[i].length ; j++){

            if(cities[i][j] != 0){

                int u=i;
                int v=j;
                int wt=cities[i][j];

                graph[u].add(new Edge(u,v,wt));

                
            }

        }
       }
       System.out.println(connectCities(graph));

    }
}






                // 2 METHOD


/*

import java.util.PriorityQueue;


public class ConnectCitiesWithMinCost {

    static class Edge {
        
        int dest;
        int cost;

        Edge(int d , int c){
            this.dest=d;
            this.cost=c;
        }

        
    }

    public static int connectCities(int cities[][]){
        PriorityQueue<Edge> pq= new PriorityQueue<>((a,b)->a.cost-b.cost);
        boolean visited[]= new boolean[cities.length];
        pq.add(new Edge(0,0));

        int finalcost=0;

        while(!pq.isEmpty()){
           Edge curr= pq.remove();
           if(!visited[curr.dest]){
            visited[curr.dest]=true;
            finalcost+=curr.cost;

            for(int i=0 ; i < cities[curr.dest].length ; i++ ){
                if(cities[curr.dest][i] != 0){
                    pq.add(new Edge( i ,cities[curr.dest][i] ));
                }
            }
           }   
        }


        return finalcost;
    }
    public static void main(String[] args) {

       int cities[][]={
        {0,1,2,3,4},
        {1,0,5,0,7},
        {2,5,0,6,0},
        {3,0,6,0,0},
        {4,7,0,0,0}
       };

       System.out.println(connectCities(cities));

    }
}




*/