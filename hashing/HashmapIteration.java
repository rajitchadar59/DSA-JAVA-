import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class HashmapIteration {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 10);
        map.put("banana", 20);
        map.put("orange", 30);
        map.put("grape", 40);

        //Iteration on map - using keySet()
        Set<String> keys = map.keySet();

        for (String key : keys) {

            System.out.println(" key= " + key + " : " + " value= " + map.get(key));

        }

        //Iteration on map - using enteySet()

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            // System.out.println(entry.getKey() + " -> " + entry.getValue());
            System.out.println(entry);
        }

    }
}
