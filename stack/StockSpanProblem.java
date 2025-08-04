
import java.util.Stack;

public class StockSpanProblem {

    public static  void stocksSpan(int stocks[] , int spans[]){
       Stack<Integer> s= new Stack<>();
       spans[0]=1;
       s.push(0);

       for(int i = 1 ; i < stocks.length ; i++){
        int currPrice=stocks[i];
        while(!s.isEmpty() && currPrice > stocks[s.peek()]){
            s.pop();
        }

        if(s.isEmpty()){
           spans[i]=i+1;
            
        }else{
         int preHigh=s.peek();
         spans[i]= i-preHigh;
         
        }
        s.push(i);
       }
    }

    public static void main(String[] args) {
      int stocks[]={150,100,80,70,80,110,120};
      int spans[]=new int[stocks.length];
      stocksSpan(stocks,spans);

      for(int i =0 ; i < spans.length ; i++){
        System.out.print(spans[i]+" ");
      }
    }
}