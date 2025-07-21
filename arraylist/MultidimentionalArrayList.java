import java.util.ArrayList;

public class MultidimentionalArrayList {
    public static void main(String[] args) {
       ArrayList<ArrayList<Integer>> mainList= new ArrayList<>();
       ArrayList<Integer> list=new ArrayList<>();
       list.add(1);
       list.add(2);
       list.add(3);

       ArrayList<Integer> list2=new ArrayList<>();
       list2.add(10);
       list2.add(20);
       list2.add(30);
       mainList.add(list);
       mainList.add(list2);
        
       for(int i =0 ; i <mainList.size() ; i++){
       ArrayList<Integer> currList = mainList.get(i);
       for(int j =0 ; j<currList.size() ; j++ ){
        System.out.print(currList.get(j)+" ");
       }
       System.out.println();
       }

    }
}