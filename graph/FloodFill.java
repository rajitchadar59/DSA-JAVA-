public class FloodFill {


    public static  void helper(int[][] image , int sr , int sc , int color ,boolean vis[][] ,int originalColor ){ // O(m*n)

           if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || vis[sr][sc] || image[sr][sc] != originalColor  ){
                  return;
           }

            vis[sr][sc]=true;
            image[sr][sc]=color;

           //left 
           helper(image, sr, sc-1, color, vis, originalColor);

           //right
           helper(image, sr, sc+1, color, vis, originalColor);

           //up 
           helper(image, sr-1, sc, color, vis, originalColor);

           //down
           helper(image, sr+1, sc, color, vis, originalColor);

           image[sr][sc]=color;

    }

    public static int[][] floodFill(int[][] image , int sr , int sc , int color ){
      boolean vis[][] = new boolean[image.length][image[0].length];
       helper(image , sr ,sc ,color ,vis ,image[sr][sc]);
       return image;
    }
    public static void main(String[] args) {
   

    }
}