public class diagonal_sum {

    public static int ds(int matrix[][]){
        int sum=0;

        /*

        o(n^2)

        for(int i =0 ; i <matrix.length ; i++){
            for(int j =0 ; j <matrix[i].length ; j++){
                //for primary diagonal

                if(i==j){
                    sum=sum+matrix[i][j];
                } 
                else if(i+j==matrix.length-1){
                 //for secondary diagonal
                   sum=sum+matrix[i][j];
                }

                
            }
        }

        */ 
     

        //o(n)
       for(int i =0 ; i <matrix.length ; i++){
        sum = sum+matrix[i][i];

        if(i != matrix.length-1-i ){
            sum = sum+matrix[i][matrix.length-1-i];
        }
       }


      return sum;

    }
    public static void main(String[] args) {
        int[][] matrix = {
            {0, 1, 2},
            {3, 4, 5},
            {6, 7, 8}
        };

     int diagonalSum =  ds(matrix);
     System.out.println("the diagonal sum is :"+diagonalSum);
    }
}