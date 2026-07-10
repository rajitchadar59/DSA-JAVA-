import java.util.*;
public class twodimentionarray {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    // input "1,2,3,4,5,6" rows = 3 , cols = 2

     int rows = 3 , cols = 3;
     
     String line = sc.nextLine();

     String numbers[] = line.split(",");

     int matrix[][] = new int[rows][cols];

     int k =0;

     for(int i = 0 ; i < rows ; i++ ){
        for(int j = 0 ; j < cols ; j++){
            int num = Integer.parseInt(numbers[k]);
            matrix[i][j]=num;
            k++;
        }
     }

       for(int i = 0 ; i < rows ; i++ ){   
            
           System.out.println(Arrays.toString(matrix[i]));    
       
      }

    }
}

