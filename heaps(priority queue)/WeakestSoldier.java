import java.util.PriorityQueue;

public class WeakestSoldier {
    static class Row implements  Comparable<Row>{
        int solders;
        int i;
        Row(int solders ,int i){
            this.solders=solders;
            this.i=i;

        }

        @Override

        public int compareTo(Row r2){
            if(this.solders == r2.solders){
                return this.i-r2.i;
            }
            else{
                return this.solders-r2.solders;
            }
        }
    }
    public static void main(String[] args) {
      int army[][]={
       {1,0,0,0},
       {1,1,1,1},
       {1,0,0,0},
       {1,0,0,0}
      }; 
      int k=2;
      
      PriorityQueue<Row> pq= new PriorityQueue<>();
      for(int i=0 ; i < army.length ; i++){
        int count=0;
        for(int j=0 ; j<army[0].length ; j++){
            if(army[i][j]==1){
                count++;
            }
        }
        pq.add(new Row(count ,i));
      }

      for(int i=0 ; i <k ; i++){
        System.out.println("R"+pq.remove().i);
      }
    }
}