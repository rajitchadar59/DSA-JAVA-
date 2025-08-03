import java.util.Stack;

public class QueueUsing2Stack {
    static  class Queue{
        static Stack<Integer> s1= new Stack<>();
        static Stack<Integer> s2= new Stack<>();

        public static  boolean isEmpty(){
            return s1.isEmpty();
        }

        public static void add(int data){
            if(isEmpty()){
             s1.push(data);

            }else{
              while(!isEmpty()){
                s2.push(s1.pop());
              }

              s1.add(data);

              while(!s2.isEmpty()){
                s1.push(s2.pop());
              }
            }
        }

           public static  int remove(){
                if(isEmpty()){
                    System.out.println("queue empty");
                    return -1;
                    
                }

                return s1.pop();
            }

            public static int peek(){
               if(isEmpty()){
                    System.out.println("queue empty");
                    return -1;
                    
                } 

                return s1.peek(); 
            }
    }
  public static void main(String[] args) {
    Queue q= new Queue();
    q.add(3);
    q.add(4);
    q.add(5);

    while(!q.isEmpty()){
        System.out.print(q.peek()+" ");
        q.remove();
    }
  }
}
