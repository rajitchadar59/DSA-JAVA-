public class FriendPairing {
      public static int pairProblem(int n){
        if(n == 1 || n == 2){
            return n;
        }
        // single
        int singleWays = pairProblem(n - 1);
        // pair
        int pairWays = (n - 1) * pairProblem(n - 2);
        return singleWays + pairWays;
    }
    public static void main(String[] args) {
     System.out.println(pairProblem(5));


    }
}