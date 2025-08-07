import java.util.*;

public class IndianCoins{
    public static void main(String[] args) {
       Integer coins[]={1,2,5,10,20,50,100,500,2000};
       Arrays.sort(coins ,Collections.reverseOrder());
       int coinCount=0;
       int amount=875;
       ArrayList<Integer> ans= new ArrayList<>();

       for(int i =0 ; i <coins.length ; i++){
        if(coins[i] <= amount){
         while(coins[i] <= amount){
            amount=amount-coins[i];
            ans.add(coins[i]);
            coinCount++;
         }
        }
       }


       System.out.println("total minimum coins :"+coinCount);
       System.out.println("coins used : "+ans);

    }
}