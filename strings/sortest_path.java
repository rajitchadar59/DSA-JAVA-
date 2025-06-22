public class sortest_path {
    public static void SortestPath(String str){
      int x=0;
      int y=0;

      for(int i =0 ; i <str.length() ; i++){
        if(str.charAt(i)=='N'){
            y++;
        }
        else if(str.charAt(i)=='S'){
            y--;
        }
        else if(str.charAt(i)=='W'){
            x--;
        }else{
            x++;
        }
      }
        
      float sortest_distence=(float)Math.sqrt((x*x)+(y*y));
      System.out.println(sortest_distence);
    }
    public static void main(String[] args) {
      String str="WNEENESENNN";
      SortestPath(str);
    }
}