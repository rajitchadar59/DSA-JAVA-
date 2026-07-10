import java.util.*;
public class special_type{
    public static void main(String[] args) {
      // when input is like {1,2,3,4,5} or {1 2 3 4 5} 
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine().trim();

        // s = s.trim(); // use to remove extra spaces at the starting and ending

        if(s.startsWith("[") && s.endsWith("]")){
            s = s.substring(1,s.length()-1);
        }
    

      // String arr[] = s.split(" "); // for space sepeated "\\s+" also used when there is diffreng diffrent space between a  b    c
       String arr[] = s.split("\\s*,\\s*");  // for , seprated values split("\\s*,\\s*") is also used 

        ArrayList<Integer> list = new ArrayList<>();

        for(String num : arr){

           int n = Integer.parseInt(num);   
           list.add(n);

        }

        for(int num : list){
             System.out.print(num+" ");
        }

        sc.close();
    }
}