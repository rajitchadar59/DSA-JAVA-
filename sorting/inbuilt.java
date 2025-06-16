import java.util.Arrays;
import java.util.Collections;
public class inbuilt {
    public static void main(String[] args) {
        Integer arr[]={5,15,2,45,8,3};
        Arrays.sort(arr,0,3,Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
        }
    }
}