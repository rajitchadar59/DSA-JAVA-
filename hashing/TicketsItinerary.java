import java.util.HashMap;

public class TicketsItinerary {
    public static String getStart(HashMap<String ,String> ticket){
        HashMap<String ,String> rev=new HashMap<>();
        
        for(String key :ticket.keySet()){
          rev.put(ticket.get(key) ,key);
        }
       
        for(String key :ticket.keySet()){
          if(!rev.containsKey(key)){
            return key;
          }
        }
       
       return null;
    }

    public static void main(String[] args) {

      HashMap<String ,String> ticket=new HashMap<>();
      ticket.put("chennai", "bengluru");
      ticket.put("mumbai", "delhi");
      ticket.put("goa", "chennai");
      ticket.put("delhi", "goa");

      String start=getStart(ticket);
      System.out.print(start);
      
      
      while(ticket.containsKey(start)){
            System.out.print("-->" + ticket.get(start));
            start = ticket.get(start);
        }
     

    }
}