import java.util.HashMap;
public class map {
    public static void main(String[] args) {
       HashMap<String , Integer> map= new HashMap<>();

       //insert O(1)
       
       map.put("india" ,100);
       map.put("china" ,200);
       map.put("usa",50);

       //get(key) O(1) -if enter wrong key return null

       int population=map.get("india");
       System.out.println(population);

       //containsKey(key) O(1)  return boolean

       System.out.println(map.containsKey("india"));


       //remove(key) delete key-value pair   - if enter wrong key return null
      
       System.out.println(map);
       map.remove("usa");
       System.out.println(map);
      

       //size()

       System.out.println(map.size());
      
       //clear

       map.clear();

       //isEmpty() -return boolean

       System.out.println(map.isEmpty());

      

       
    }
}