import java.util.LinkedHashMap;
import java.util.Set;
public class Linkedhashmap {
    public static void main(String[] args) {

    LinkedHashMap<String,Integer> map= new LinkedHashMap<>();
     
     map.put("india",100);
     map.put("china",150);
     map.put("us",50);
    
    System.out.println(map);
    
    Set<String> keys=map.keySet();
    
    for (String key : keys) {
       System.out.println(key+" : "+map.get(key));  
    }
   
    }
}