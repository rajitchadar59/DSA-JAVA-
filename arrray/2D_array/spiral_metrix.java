public class spiral_metrix{
    public static void print_spiral(int metrix[][]){
    int startRow=0;
    int startCol=0;
    int endRow=metrix.length-1;
    int endCol=metrix[0].length-1;

   while(startRow <= endRow && startCol <= endCol){
    //top
    for(int j=startCol ; j <= endCol ; j++){
        System.out.print (metrix[startRow][j]+" ");
    }
    //right
    
    for(int i =startRow+1 ; i <= endRow ; i++){
        System.out.print (metrix[i][endCol]+" ");
    }
    

    //bottom 
    for(int j = endCol-1 ; j>=startCol ; j--){
        if(startRow==endRow){
            break;
        }
        System.out.print (metrix[endRow][j]+" ");
    }
    

    //left
    for(int i =endRow-1 ; i >=startRow+1 ; i--){
    if(startCol==endCol){
            break;
        }
    System.out.print (metrix[i][startCol]+" ");    
    }

    startCol++;
    endCol--;
    startRow++;
    endRow--;

   }
  System.out.println();
    
    }
 
    public static void main(String[] args) {
     int metrix[][]={
        {1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16}
     };

   print_spiral(metrix);

    }
}