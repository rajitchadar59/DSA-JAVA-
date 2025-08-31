import java.util.Set;
import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {
     TreeMap<Integer,Integer> map= new TreeMap<>();
     
     map.put(100, 3);
     map.put(150, 1);
     map.put(50, 5);
     
     

    System.out.println(map);
   
    Set<Integer> keys=map.keySet();
    
    for (Integer key : keys) {
       System.out.println(key+" : "+map.get(key));  
    }


    }
}