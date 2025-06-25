public class even_odd {
    public static void main(String[] args) {
      int bitmask=1;
      int n=18;

      if((n & bitmask)==0){
        System.out.println("EVEN");
      }else{
        System.out.println("ODD");
      }
    }
}