import java.util.HashMap;
import java.util.Set;

public class MajorityElement {
    public static void main(String[] args) {
        int arr[]={1,3,2,5,1,3,1,5,1};
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i =0 ; i <arr.length ; i++){
            int curr=arr[i];
            if(map.containsKey(curr)){
                map.put(curr,map.get(curr)+1);
            }
            else{
            map.put(curr,1);
  
            }
            
        }

        Set<Integer> keys=map.keySet();
         
         for(Integer key : keys){
           if(map.get(key) > arr.length/3){
            System.out.println(key);
           }

         }
        
    }
}




        //SHORT CODE 

/*

        import java.util.HashMap;


      public class MajorityElement {
         public static void main(String[] args) {
        int arr[]={1,3,2,5,1,3,1,5,1};
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i =0 ; i <arr.length ; i++){

            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
         
         for(Integer key : map.keySet()){
           if(map.get(key) > arr.length/3){
            System.out.println(key);
           }

         }
        
    }
}


*/