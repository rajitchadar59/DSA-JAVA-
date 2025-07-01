public class PrintFactorial {
    public static int print_fact(int n){
    
    if(n==0){
        return 1;
    }
    int factnm1=print_fact(n-1);
    int fact= n*factnm1;

     return fact;

    }
    public static void main(String[] args) {
        System.out.println(print_fact(5));
    }
}