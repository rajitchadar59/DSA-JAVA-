import java.util.ArrayList;

public class MaximumInList {
    public static void main(String[] args) {
        int max= Integer.MIN_VALUE;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(12);
        list.add(13);
        list.add(4);
       
       System.out.println(list);
       for(int i =0 ; i <list.size() ; i++){
        max=Math.max(max, list.get(i));
       }

       System.out.println(max);

    }
}