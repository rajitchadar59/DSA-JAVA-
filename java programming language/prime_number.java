import java.util.Scanner;
public class prime_number {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("enter the number :");
       boolean isprime = true;
       int n = sc.nextInt();
       
       if(n==2){
        System.out.println("prime number !");
       }
       else{

            for(int i = 2; i <= Math.sqrt(n); i++) {
           if(n % i == 0) {
               isprime = false;
               break;
           }
       }
       if(isprime) {
           System.out.println("prime number");
       } else {
           System.out.println("not prime number");
       }

       }
   
    }
}