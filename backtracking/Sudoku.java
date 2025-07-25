public class Sudoku {
    
    public static boolean isSafe(int sudoku[][] , int row , int col , int digit){
        //for row
        for(int i =0 ; i < 9 ; i++){
            if(sudoku[row][i]==digit){
                return false;
            }
        }

        //for col

        for(int i =0 ; i < 9 ; i++){
            if(sudoku[i][col]==digit){
                return false;
            }
        }
         
        //for grid
        int sr=(row/3)*3;
        int sc=(col/3)*3;

        for(int i = sr ; i < sr+3 ; i++){
            for(int j =sc ; j <sc+3 ; j++){
               if(sudoku[i][j]==digit){
                return false;
               }
            }
        }


        return true;
    }


    public static boolean sudokuSolver(int sudoku[][] , int row , int col){
        if(row==9){
            return true;
        }
     



        int nextRow=row, nextCol=col+1;
        if(col+1==9){
            nextRow=row+1;
            nextCol=0;
        }

        if(sudoku[row][col] !=0){
          return  sudokuSolver(sudoku,nextRow, nextCol);
              
        }
        for(int digit=1 ; digit <=9 ; digit++){
            if(isSafe(sudoku , row , col ,digit)){
                sudoku[row][col]=digit;
               if(sudokuSolver(sudoku,nextRow, nextCol)){
                return true;
               }
               sudoku[row][col]= 0;
            }
        }
        return false;
    }

    public static void printSudoku(int sudoku[][]){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] sudoku = {
            {0, 0, 0, 2, 6, 0, 7, 0, 1},
            {6, 8, 0, 0, 7, 0, 0, 9, 0},
            {1, 9, 0, 0, 0, 4, 5, 0, 0},
            {8, 2, 0, 1, 0, 0, 0, 4, 0},
            {0, 0, 4, 6, 0, 2, 9, 0, 0},
            {0, 5, 0, 0, 0, 3, 0, 2, 8},
            {0, 0, 9, 3, 0, 0, 0, 7, 4},
            {0, 4, 0, 0, 5, 0, 0, 3, 6},
            {7, 0, 3, 0, 1, 8, 0, 0, 0}
        };
      if(sudokuSolver(sudoku,0,0)){
        System.out.println("solution is possible");
        printSudoku(sudoku);
      }else{
       System.out.println("solution is not possible");
      }

       
    }
}