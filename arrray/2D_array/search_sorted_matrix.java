public class search_sorted_matrix {
    public static boolean  staircase_search(int matrix[][] ,int key){
      int row=  0;
      int col= matrix[0].length-1;
      while(row < matrix.length && col >= 0){
        if(matrix[row][col]==key){
            System.out.println("key found  at ("+row+" , "+col+")");
            return  true;

        }
        else if(key < matrix[row][col]){
           col--; //left move
        }
        else{
            row++; //bottom move
        }
      }
      System.out.println("key not found");
      return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 4, 7, 11},
            {2, 5, 8, 12},
            {3, 6, 9, 16},
            {10, 13, 14, 17}
        };

       int key =25;
      System.out.println(staircase_search(matrix, key));
    }
}