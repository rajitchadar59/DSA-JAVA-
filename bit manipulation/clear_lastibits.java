public class clear_lastibits {
    public static int clear_last_ibits(int n , int i){
    int bitmask=~0<<i;
    return n &bitmask;
    }

    public static int clear_in_range(int n , int i , int j){
        int a =((~0)<<(j+1));
        int b= (1<<i)-1;
        int bitmask=a|b;
        return n&bitmask;

    }
    public static void main(String[] args) {
     System.out.println(clear_in_range(10 ,2 ,4));
     System.out.println(clear_last_ibits(15,2));
    
    }
}