public class GridWays {
    public static int totalGridWays(int i , int j , int n , int m){

     if(i==n-1 && j==m-1){//for last cell  
     return 1;
     }
     else if(i==n || j==m){// for boundry cross 
        return 0;
     }

    int w1=totalGridWays(i+1, j, n, m);
    int w2=totalGridWays(i, j+1, n, m);
    return w1+w2;
    }
    public static void main(String[] args) {
       int n=4 ; int m=4;
      System.out.println("total ways: "+totalGridWays(0,0, n, m));
    }
}