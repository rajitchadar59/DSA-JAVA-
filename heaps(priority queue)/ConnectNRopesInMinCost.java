
import java.util.PriorityQueue;

public class ConnectNRopesInMinCost {
    public static void main(String[] args) {
    int ropes[]={2,3,3,4,6};
    PriorityQueue<Integer> pq= new PriorityQueue<>();
    
    for(int i=0 ; i <ropes.length ; i++){
        pq.add(ropes[i]);
    }

    int cost=0;

    while(pq.size() > 1){
      int  min1=pq.remove();
      int  min2=pq.remove();
      int rope=min1+min2;
      cost+=rope;
      pq.add(rope);
    }

    System.out.println("cost of connecting n ropes : "+cost);

    }
}
