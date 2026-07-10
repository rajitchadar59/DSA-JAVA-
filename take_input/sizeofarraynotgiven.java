import java.util.*;
public class sizeofarraynotgiven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();

        // "1 2 3 4 5"
        // "1,2,3,4,5"

       String arr[] = s.split(" "); // for space sepeated 
       // String arr[] = s.split(",");  // for , seprated values

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