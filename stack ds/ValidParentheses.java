import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String str){
        Stack<Character> s= new Stack<>();
        
        for(int i = 0 ; i < str.length() ; i++){
            char currChar=str.charAt(i);
            if(currChar=='(' || currChar=='{' ||currChar=='['){
                s.push(currChar);
            }else{
                if(s.isEmpty()){
                    return false;
                }

                if((s.peek()=='(' && currChar==')') || (s.peek()=='{' && currChar=='}') || (s.peek()=='[' && currChar==']')){
                 s.pop();
                }else{
                    return false;
                }
            }
      

        }

          if(s.isEmpty()){
                return  true;
            }
        
         return false;
    }
    public static void main(String[] args) {
       String str="((()))]";
       System.out.println(isValid(str));
    }
}