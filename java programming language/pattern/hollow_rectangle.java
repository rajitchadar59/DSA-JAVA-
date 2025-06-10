public class hollow_rectangle {
    public static void hollowrectangle(int tr , int tc){
     for(int i =1 ; i <=tr ; i++){
        for(int j=1 ; j<=tc ; j++){
            if(i==1||i==tr||j==1||j==tc){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
     }   
    }
    public static void main(String[] args) {
      hollowrectangle(4, 5);
    }
}