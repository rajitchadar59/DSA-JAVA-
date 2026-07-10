import java.util.*;
public class sizeofanarrayisgiven2{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < n ; i++){
          list.add(sc.nextInt());

        }

        for(int a : list){
            System .out.print(a+" ");
        }


        sc.close();

    }
}