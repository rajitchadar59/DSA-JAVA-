import java.util.ArrayList;
import java.util.Collections;
public  class JobSequencingProblem{
    static  class Job{
        int deadline;
        int profit;
        int id;//0(A)1(B)2(c)
        
        public Job(int i , int d, int p){
            deadline=d;
            profit=p;
            id=i;


        }

    }
    public static void main(String[] args) {
        int jobsinfo[][]= {{4,20},{1,10},{1,40},{1,30}};
         ArrayList<Job> jobs =new ArrayList<>();

        for(int i =0 ; i <jobsinfo.length ; i++){
            jobs.add(new Job(i ,jobsinfo[i][0] ,jobsinfo[i][1]));
        }  
        
        // Collections.sort(jobs,(obj1,obj2)->obj1.profit-obj2.profit);//ascending order profit

         Collections.sort(jobs,(obj1,obj2)->obj2.profit-obj1.profit);//descending order profit
         
        ArrayList<Integer> seq= new ArrayList<>();
        int time=0;
        int profit=0;
        for(int i =0 ; i < jobs.size() ;i++ ){
            Job curr= jobs.get(i);
            if(curr.deadline  > time){
                seq.add(curr.id);
                time++;
                profit+=curr.profit;
            }
        }
        
        System.out.println("max profit: "+profit+"maxs no.of jobs : "+seq.size());
       for(int i =0 ; i < seq.size() ;i++){
         System.out.println(seq.get(i)); 
       }
      
    }
}