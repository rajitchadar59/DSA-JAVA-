import java.util.ArrayList;

public class PrintRevere {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(10);
        list.add(15);
         System.out.println(list);
        for(int i =list.size()-1  ; i >=0 ; i-- ){
         System.out.println(list.get(i));
         
        }
        
    }
}