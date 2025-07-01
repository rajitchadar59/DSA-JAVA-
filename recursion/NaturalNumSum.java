public class NaturalNumSum {
    public static int sumofnaturalnumber(int n){
    
     if(n==1){
       return 1;
     }
      
     int sumnm1= sumofnaturalnumber(n-1);
     int  sum= n+sumnm1;
     return sum;
    }
    public static void main(String[] args) {
      System.out.println(sumofnaturalnumber(6)); 
    }
}