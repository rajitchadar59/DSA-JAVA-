public class function_overloading {
   
   public static int sum(int a , int b){
    return a+b;
   }

   public static int sum(int a , int b,int c){
    return a+b+c;
   }

   public static  float sum (float a , float b){
    return a+b;
   }
    public static void main(String[] args) {
      float res = sum(4.5f,3.2f);
      System.out.println("sum "+res);
    }
}