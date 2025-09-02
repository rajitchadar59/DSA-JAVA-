import java.util.LinkedHashSet;


public class LinkedHashset {
    public static void main(String[] args) {
     LinkedHashSet<Integer> set = new LinkedHashSet<>();
     set.add(5);
     set.add(4);
     set.add(15);
     set.add(16);
    
     set.remove(5);

     for(Integer i : set){
        System.out.println(i);
     }
      
      
    }
}