public class string_comparision {
    public static void main(String[] args) {
      String str1="rajit";
      String str2="rajit";
      String str3=new String("rajit");
      if(str1==str2){
        System.out.println("strings equal");
      }else{
        System.out.println("strings not equal");
      } 

      if(str1==str3){
        System.out.println("strings equal");
      }else{
        System.out.println("strings not equal");
      } 


      if(str1.equals(str3)){
        System.out.println("==");
      }else{
        System.out.println("!=");
      }
    
  


    }
    
}