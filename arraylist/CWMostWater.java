//brute force - container with most water O(n^2)
import java.util.ArrayList;
public class CWMostWater {
    public static int mostWater(ArrayList<Integer> height){
        int maxWater=0;

        for(int i =0 ; i < height.size() ; i++){
            for(int j = i+1 ; j < height.size() ; j++){
                int width=j-i;
                int containerHeight=Math.min(height.get(i) , height.get(j));
                int area=width*containerHeight;
                maxWater=Math.max(maxWater ,area);
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
       ArrayList<Integer> height = new ArrayList<>();
          height.add(1);
          height.add(8);
          height.add(6);
          height.add(2);
          height.add(5);
          height.add(4);
          height.add(8);
          height.add(3);
          height.add(7);

          System.out.println("maximun water is "+mostWater(height));
    }

}