public class Tiling_Problem {
    public static int tilling_ways(int n){
        if(n==0 || n==1){
            return 1;
        }

        //vertical choice
        int verticalTiles=tilling_ways(n-1);
        //horizontal ways
        int horizontalTiles=tilling_ways(n-2);

        return verticalTiles+horizontalTiles;
    }
    public static void main(String[] args) {
       System.out.println(tilling_ways(5)); 
    }
}