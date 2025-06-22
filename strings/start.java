import java.util.*;
public class start {
    public static void main(String[] args) {
      char arr[]={'a' ,'b','c'};
      String str="abc";
      String str2= new String("abcd");

     //input 
     Scanner sc = new Scanner(System.in);
     String name = sc.next();
     System.out.println(name);
     
     
     //string length
     String s="rajit";
     System.out.println("length of string : "+s+" is :"+s.length());


     //string con concatenatention 
     
     String firstName="rajit";
     String lastName="chadar";
     String fullName=firstName+lastName;
     System.out.println(" the full name is : "+fullName);

     System.out.println(" the full name is : "+firstName.concat(lastName));


     //charAt()

     String forcharat="charAt";
     System.out.println("first char is : "+forcharat.charAt(0));



    }
}