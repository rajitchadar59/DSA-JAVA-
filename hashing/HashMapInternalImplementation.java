import java.util.*;

public class HashMapInternalImplementation {
    static class HashMap<K,V>{//generic
     
     private class Node{
        K key;
        V value;

        public Node( K key , V value){
            this.key=key;
            this.value=value;
        }
     }
       
       private int n;
       private int N;
       private LinkedList<Node> buketes[];//N buketes.length

      @SuppressWarnings("unchecked")

      public  HashMap() {
        this.N=4;
        this.buketes= new LinkedList[4];
        
        for(int i = 0 ; i < 4 ; i++){
            this.buketes[i]=new LinkedList<>();
        }
      
      }

      private int hashFunction(K key){

         int hc= key.hashCode();
          return Math.abs(hc) % N;
      }

      private int searchInLL(K key , int bi){
      
      LinkedList<Node> ll = buketes[bi];
       int di=0;
      for(int i =0 ; i < ll.size() ; i++){
       
        Node node = ll.get(i);
        if(node.key==key){
         return di;
        }

        di++;

      }
      
      return -1;

      }

      @SuppressWarnings("unchecked")

     private void rehash(){

      LinkedList<Node> oldbuketes[]=buketes;
      buketes=new LinkedList[N*2];
      N=N*2;
      
      for(int i =0 ; i < buketes.length ; i++){
        buketes[i]=new LinkedList<>();

      }

      for(int i =0 ; i < oldbuketes.length ; i++){
        LinkedList<Node> ll= oldbuketes[i];

        for(int j=0 ; j < ll.size() ; j++ ){
           Node node = ll.get(j); 
           put(node.key ,node.value);

        }
      }


     }




      public void put(K key , V value){ //o(lambda) o(1)
        
      int bi= hashFunction(key);
      int di=searchInLL(key ,bi);
      if(di != -1){   
        Node node = buketes[bi].get(di);
        node.value=value;
      }else{

        buketes[bi].add(new Node(key ,value));
        n++;
      }
      
      double lambda=n/N;

      if(lambda > 2.0){
        rehash();
      }


      }


      public  boolean containsKey(K key){//o(lambda) o(1)

        int bi= hashFunction(key);
        int di=searchInLL(key ,bi);

        if(di != -1){   
        return  true;
        }
        else{
        return false;
         }

      }


      public V get( K key){ //o(lambda) o(1)

      int bi= hashFunction(key);
      int di=searchInLL(key ,bi);
      if(di != -1){   
        Node node = buketes[bi].get(di);
        return node.value;
      }
      else{
       
       return null;

      }

      }


      public V remove(K key){ //o(lambda) o(1)
      
      int bi= hashFunction(key);
      int di=searchInLL(key ,bi);
      if(di != -1){   
        Node node = buketes[bi].remove(di);
        n--;
        return node.value;
      }else{
        return null;
      }
        
      }


     public ArrayList<K> keySet(){
        ArrayList<K> keys = new ArrayList<>();

        for(int i =0 ; i < buketes.length ; i++){
         LinkedList<Node> ll=buketes[i];
         for(Node node : ll){
          keys.add(node.key);
         }
        }

         return keys;

     }

     public boolean isEmpty(){
        return n==0;
     }

        
    }
    public static void main(String[] args) {
       HashMap<String ,Integer> map=new HashMap<>(); 

       map.put("canada",50);
       map.put("india",100);
       map.put("china",200);
       map.put("usa",10);

       map.remove("india");

    ArrayList<String> keys=map.keySet();
    for(String key : keys){
        System.out.println(key+" : "+map.get(key));
    }


    }
}