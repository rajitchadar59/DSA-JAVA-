public class number_is_pow2_n {
    public static void no_in_powerOftwo(int n){
        if((n & (n-1))==0){
            System.out.println("yes the number is 2^n");
        }else{
            System.out.println("no the number is not  2^n");

        }
    }
    public static void main(String[] args) {
       int n =8;
       no_in_powerOftwo(n);
    }
}