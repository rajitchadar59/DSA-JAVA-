import java.util.ArrayList;
public class Syntax {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        //add element
        list.add(5);
        list.add(2);
        list.add(4);
        list.add(6);

        System.out.println(list);
     //2nd type add

     list.add(1,10);

    System.out.println(list);

       //get element
     int el=  list.get(2);
     System.out.println(el);
    
      System.out.println(list);
     //remove elment
     list.remove(2);
   
     System.out.println(list);
     //set element at index
     list.set(2, 10);
    System.out.println(list);

    //contains
    System.out.println(list.contains(12));
    System.out.println(list.contains(10));

    //size of array list
    System.out.println(list);
    System.out.println(list.size());
    

    }
}