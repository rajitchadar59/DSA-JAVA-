import java.util.ArrayList;

public class Swap {

    public static void swapNum(ArrayList<Integer> list , int idx1 , int idx2){
        int temp = list.get(idx1);
        list.set(idx1 ,list.get(idx2));
        list.set(idx2 ,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(8);
        list.add(6);
        list.add(9);

       int idx1= 0; int idx2=1;
      System.out.println(list);
      swapNum(list, idx1, idx2);
      System.out.println(list);
    }
}