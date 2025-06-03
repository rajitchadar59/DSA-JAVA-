public class Typeconversion {
    public static void main(String[] args) {
     /* 
      implicit ---->widening
         int a = 10;
          long b = a;
        // long a=10;
        // int b =a;  lossy conversion 

       System.out.println(b);

       */

     //explicit - narrowing 
     float a =12.51f;
     int b= (int)a;
     System.out.println(b);

    }
}