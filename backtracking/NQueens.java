public class NQueens {

public static boolean isSafe(char board[][] , int row  , int col ){
    //vertical up
    for(int i=row-1 ; i >=0 ; i-- ){
     if(board[i][col]=='Q') {
        return false;
     }  
    }

    //diagonal left up
    
    for(int i = row-1,j=col-1 ; i >=0 && j >= 0 ; i--,j-- ){
       if(board[i][j]=='Q') {
        return false;
     }   

    }


    //diagonal right up

       for(int i = row-1,j=col+1 ; i >=0 && j < board.length ; i--,j++ ){
       if(board[i][j]=='Q') {
        return false;
     }   

    }
 

    return true;
}


    public static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    static int  count=0;
    public static void nQueens(char board[][] , int row){
        
        if(row==board.length){
            count++;
            printBoard(board);
            return;
        }

        for(int j=0 ; j <board.length ; j++){
            if(isSafe(board , row , j)){
                board[row][j]='Q';
                nQueens(board, row+1);
                board[row][j]='.';
            }
      
        }
    }
  public static void main(String[] args) {
       int n =4;
      char board[][]= new char[n][n];

       for(int i = 0 ; i <n ; i++){
        for(int j =0 ; j < n ; j++){
            board[i][j]='.';
        }
       }

       nQueens(board ,0);
       System.out.println("total no. of soltions are :"+count);
    }
}






//check if the problem can be solved & print only 1 solution to n queens problem

/*


public class NQueens {

public static boolean isSafe(char board[][] , int row  , int col ){
    //vertical up
    for(int i=row-1 ; i >=0 ; i-- ){
     if(board[i][col]=='Q') {
        return false;
     }  
    }

    //diagonal left up
    
    for(int i = row-1,j=col-1 ; i >=0 && j >= 0 ; i--,j-- ){
       if(board[i][j]=='Q') {
        return false;
     }   

    }


    //diagonal right up

       for(int i = row-1,j=col+1 ; i >=0 && j < board.length ; i--,j++ ){
       if(board[i][j]=='Q') {
        return false;
     }   

    }


    return true;
}


    public static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
   
    public static boolean nQueens(char board[][] , int row){
        
        if(row==board.length){
            printBoard(board);
            return true;
        }

        for(int j=0 ; j <board.length ; j++){
            if(isSafe(board , row , j)){
                board[row][j]='Q';
               if(nQueens(board, row+1)){
                return true;
               } 
                board[row][j]='.';
            }
      
        }

        return false;
    }
  public static void main(String[] args) {
       int n =2;
      char board[][]= new char[n][n];

       for(int i = 0 ; i <n ; i++){
        for(int j =0 ; j < n ; j++){
            board[i][j]='.';
        }
       }

     System.out.println(  nQueens(board ,0));
       
    }
}


*/