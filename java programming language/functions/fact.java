
import java.util.Scanner;

public class fact {
    public static void fact(int n){
        int f=1;
        int i = n;
        while(i>= 1){
            f=f*i;
            i--;

        }
        System.out.println("factorial of "+n+" is :"+f);
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number ");
    int n = sc.nextInt();
    fact(n);
    }
}