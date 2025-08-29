import java.util.*;
public class DeleteHeap {
    static class Heap{
        ArrayList<Integer> arr=new ArrayList<>();

        public void add(int data){
          arr.add(data);
          int x= arr.size()-1;
          int parent=(x-1)/2;
          while(arr.get(x) < arr.get(parent)){//O(log n)

            //swap

           int temp = arr.get(x);
           arr.set(x, arr.get(parent));
           arr.set(parent, temp);
           x = parent;            
           parent = (x - 1) / 2; 
           
          }

        }

        public int peek(){
            return arr.size()>=1 ? arr.get(0):-1;
        }
       
        private void heapify(int i){
         int left=2*i+1;
         int right=2*i+2;
         int minIdx=i;

         if(left < arr.size() && arr.get(left) < arr.get(minIdx) ){
            minIdx=left;
         }

          if(right < arr.size() && arr.get(right) < arr.get(minIdx) ){
            minIdx=right;
         }

         if(minIdx != i){
            //swap
            int temp=arr.get(i);
            arr.set(i ,arr.get(minIdx));
            arr.set(minIdx ,temp);

            heapify(minIdx);
         }
        }

        public int remove(){
            int data=arr.get(0);

            //step 1- swap first and last
            int temp=arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);

            //step 2-delete last
            arr.remove(arr.size()-1);

            //step3- fix heap using heapify
            heapify(0);

            return data;

        }


        public boolean isEmpty(){
            return arr.size()==0;
        }
    }
    public static void main(String[] args) {
       Heap h= new Heap();
       h.add(10);
       h.add(6);
       h.add(3);
       h.add(15);
       h.add(11);
      
      while(!h.isEmpty()){
         System.out.println(h.peek());
         h.remove();
      }
      
    }
}