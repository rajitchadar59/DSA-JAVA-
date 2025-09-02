import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
      HashSet<Integer> set= new HashSet<>();
     
     //add O(1) - if already added return false
     
      set.add(1);
      set.add(2);
      set.add(3);
      set.add(1);
      set.add(2);
      System.out.println(set);

      //contains(key) O(1)  return boolean

      System.out.println(set.contains(2));

      //remove(key) 

      set.remove(2);
      System.out.println(set);

      //size()

      System.out.println(set.size());

      //isEmpty()  return boolean

      System.out.println(set.isEmpty());

      //clear() 

      set.clear();

    }
}