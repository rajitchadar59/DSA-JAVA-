public class inverted_star {
    public static void main(String[] args) {
       int n =7;
      for(int i=n ;i > 0; i-- ){
        for(int j =1; j <=i ; j++){
            System.out.print("*");
        }
        System.out.println();
      }
    }
}