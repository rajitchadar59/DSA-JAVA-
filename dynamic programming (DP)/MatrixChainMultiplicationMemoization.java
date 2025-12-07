
import java.util.Arrays;

public class MatrixChainMultiplicationMemoization {

    public static int mcmMemoization(int arr[] ,int i ,int j , int dp[][]){
        if(i == j){

            return 0; // single metrix case

        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int mincost=Integer.MAX_VALUE;

        for(int k = i ; k <= j-1 ; k++){
            int cost1=mcmMemoization(arr, i, k ,dp);//Ai.....Ak matrix multiply      result size =arr[i-1]xarr[k]
            int cost2=mcmMemoization(arr, k+1, j ,dp);//Ak+1....Aj  matrix multiply  result size =arr[k]xarr[j]
            int cost3=arr[i-1]*arr[k]*arr[j];
            int finalcost=cost1+cost2+cost3;
            mincost=Math.min(mincost,finalcost);

        }

      dp[i][j]=mincost;
      return mincost;
    }
    
    public static void main(String[] args) {
       int arr[]={1,2,3,4,3};
       int n = arr.length;
        
       int dp[][]=new int[n][n];
        
        for(int i =0 ; i < dp.length ; i++){
            Arrays.fill(dp[i] ,-1);
        }

       System.out.println(mcmMemoization(arr, 1, n-1, dp));

     
    }
     
}