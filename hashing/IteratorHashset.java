import java.util.HashSet;
import java.util.Iterator;

public class IteratorHashset {
    public static void main(String[] args) {
    HashSet<Integer> set = new HashSet<>();
    set.add(2);
    set.add(5);
    set.add(8);
    set.add(3);
    set.add(12);
  

     // METHOD 1-  iteration  using iterator
    Iterator it= set.iterator();

    while(it.hasNext()){
        System.out.print(it.next()+" ");
    }
     

     // METHOD 2- iteration  using enhanced for loop

     for(Integer i : set){
        System.out.print(i+" ");
     }
    

        
    }
}