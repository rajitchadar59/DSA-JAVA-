import java.util.*;
public class InsertHeap {
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
    }
    public static void main(String[] args) {
       Heap h= new Heap();
       h.add(10);
       h.add(6);
       h.add(3);
       h.add(15);

       System.out.println(h.peek());
    }
}