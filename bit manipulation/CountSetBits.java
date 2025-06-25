public class CountSetBits {
    public static int count_set_bits(int n){
        int count=0;
        while(n > 0){
          if((n & 1) != 0 ){
            count++;
          }  
         n= n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
      int n=16;
      System.out.println("set bits are : "+count_set_bits(n));
    }
}