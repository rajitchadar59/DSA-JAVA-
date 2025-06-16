public class buy_sell_stock {
    public static int  stock_maxProfit(int prices[]){
    int maxProfit=0;
    int buyPrice=Integer.MAX_VALUE;

    for(int i =0 ; i < prices.length ; i++){
        if(buyPrice  < prices[i] ){
        int profit= prices[i]-buyPrice; //todays profit
        maxProfit=Math.max(maxProfit ,profit);
        }
        
        if(buyPrice > prices[i]){
            buyPrice=prices[i];
        }

     
    }
       return maxProfit;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println("maximum price :"+stock_maxProfit(prices));
    }
}