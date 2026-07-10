import java.util.Scanner;

public class SomeError{
    public static void main(String[] args) {

      /* int ke baad String input karate hai to issue aati hi hai 
      kyonki int ke baad hum enter kar dete hai to bo kahli soace 
      ko string man leta hai or number ke sath khali space print karba deta hai */

      Scanner sc = new Scanner(System.in);

      int num;
      num = sc.nextInt();
      sc.nextLine();//ishko likhte taki problem theak ho jaye
      String s;
      s = sc.nextLine();

      System.out.print(num+" "+s);


      //floating point display

      float val =(float) 2.352846;
      System.out.printf("%.3f",val);
      
      
            sc.close();

    }
}