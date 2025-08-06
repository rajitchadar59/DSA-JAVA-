import java.util.Arrays;

public class MinimunAbsoluteDiffrence {
    public static void main(String[] args) {
    int[] a = {100 ,200 ,300};
    int[] b = {3,2,1};
    Arrays.sort(a);
    Arrays.sort(b);
    int minDiffrence=0;
    for(int i=0 ; i < a.length ; i++ ){
      minDiffrence=minDiffrence+Math.abs(a[i]-b[i]); 
    }
    
    System.out.println("minimum absolute diffrence :"+minDiffrence);

    }
}