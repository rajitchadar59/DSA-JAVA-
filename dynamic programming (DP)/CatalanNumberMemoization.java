public class CatalanNumberMemoization {
  public static int CatalanNumberMemo(int n ,int dp[]){
    if(n==0 || n==1){
      return 1;

    }

    if(dp[n] != -1){
        return dp[n];
    }

    int ans=0;

    for(int i =0 ; i <= n-1 ; i++){
        ans += CatalanNumberMemo(i, dp)*CatalanNumberMemo(n-i-1, dp);
    }

    dp[n]=ans;
    return ans;

  }
    public static void main(String[] args) {
      int n=5;
      int dp[]= new int[n+1];
      for(int i =0 ; i <= n ; i++){
        dp[i]=-1;
      }
      
      System.out.println(CatalanNumberMemo(n, dp));
    }
}