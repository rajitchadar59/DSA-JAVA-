import java.util.Deque;
import java.util.LinkedList;


public class StackUsingDeque {
    static class Stack{
       static Deque<Integer> dq=new LinkedList<>();

        public static boolean isEmpty(){
           return dq.isEmpty();
        }

        public static void push(int data){
            dq.addLast(data);
        }

        public static int pop(){
           return dq.removeLast();
        }

        public static int peek(){
           return dq.getLast();
        } 
    }
   public static void main(String[] args) {
       Stack s= new Stack();
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
   }
}
