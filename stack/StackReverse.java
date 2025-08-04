import java.util.*;
public class StackReverse {
     public static void pushAtBottom(Stack<Integer> s ,int element){
        if(s.isEmpty()){
            s.push(element);
            return;
         
        }

        int top = s.pop();
        pushAtBottom(s, element);
        s.push(top);


    }

    public static void reverseStack(Stack<Integer> s){
       if(s.isEmpty()){
        return;

       }

       int top=s.pop();
       reverseStack(s);
       pushAtBottom(s, top); 

    }
    public static void main(String[] args) {
           Stack<Integer> s= new Stack<>();
       s.push(1);
       s.push(2);
       s.push(3);

        reverseStack(s);

        System.out.println("after reverse!");

        while(!s.isEmpty()){
        System.out.print(s.peek());
        s.pop();
        }
    }
}