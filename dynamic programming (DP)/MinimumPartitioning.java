public class MinimumPartitioning {

    public static int minpartition(int arr[]){
        int n =arr.length;
        int sum =0;
        for(int i =0 ; i < arr.length ; i++){
            sum += arr[i];
        }

        int W=sum/2;

        int dp[][]= new int[n+1][W+1];

        // initialization step skip because no need in java

        for(int i =1 ; i < n+1 ; i++){
            for(int j = 1 ; j < W+1 ; j++){
               int v=arr[i-1];
               int wt=arr[i-1];

               if(wt <= j){ // valid

                int in=v+dp[i-1][j-wt];
                int ex=dp[i-1][j];
                dp[i][j]=Math.max(in,ex);

               }
               else{  // invalid
                int ex=dp[i-1][j];
                dp[i][j]=ex;
               }

            }
        }

        int sum1=dp[n][W];
        int sum2=sum-sum1;
        return Math.abs(sum1-sum2);


    }
    public static void main(String[] args) {
        int nums[]={1,6,11,5};
       System.out.println(minpartition(nums)); 
    }
}