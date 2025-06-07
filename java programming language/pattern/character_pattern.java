public class character_pattern {
    public static void main(String[] args) {
        int n =4;
        char c='A';
          for (int i = 1; i <= n; i++) {
          for (int j = 1; j <= i; j++) {
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }
}