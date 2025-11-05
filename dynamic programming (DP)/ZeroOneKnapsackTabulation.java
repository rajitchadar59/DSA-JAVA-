public class ZeroOneKnapsackTabulation {

    public static void print(int dp[][]) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int knapsacktab(int val[], int wt[], int W) {
        int n =val.length;
        int dp[][] = new int[n + 1][W + 1];
        for (int i = 0; i < dp.length; i++) {

            dp[i][0] = 0;

        }

        for (int i = 0; i < dp[0].length; i++) {

            dp[0][i] = 0;

        }

        for(int i =1 ; i < n+1 ; i++){
            for(int j =1 ; j < W+1 ;j++){
                int v=val[i-1];
                int w=wt[i-1];

                if( w <= j){ //valid
                   
                   int inc=v+dp[i-1][j-w];
                   int ex=dp[i-1][j];

                   dp[i][j]=Math.max(inc,ex);

                }else{
                    int ex=dp[i-1][j];
                    dp[i][j]= ex;
                }
            }
        }
     
         print(dp);
        return dp[n][W];

    }

    public static void main(String[] args) {

        int[] wt = {2, 5, 1, 3, 4};
        int[] val = {15, 14, 10, 45, 30};
        int W = 7;
        System.out.println(knapsacktab(val, wt, W));


    }

}
