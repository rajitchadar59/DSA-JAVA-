import java.util.HashMap;

public class ValidAnagram {

    public static boolean validAnagram(String s ,String t){

        if(s.length() != t.length()){
            return false;
        }

    HashMap<Character ,Integer> map = new HashMap<>();
    
    for(int i =0 ; i <s.length() ; i++){
       char curr=s.charAt(i);
       map.put(curr,map.getOrDefault(curr, 0)+1);
    }

    for(int i =0 ; i <t.length() ; i++){
        char curr=t.charAt(i);
        if(map.get(curr) != null){
            if(map.get(curr)==1){
                map.remove(curr);
            }
            else{
                 map.put(curr ,map.get(curr)-1);
            }
           
        }
        else{
            return false;
        }
    }

    return map.isEmpty();

    }
    

    public static void main(String[] args) {
        
     String s="race";
     String t="care";
     System.out.println(validAnagram(s, t));

    }
}