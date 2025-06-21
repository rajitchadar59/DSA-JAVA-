
import java.util.Scanner;

public class creation {

    public static void main(String[] args) {
    
   int metrix[][]= new int[3][4];
   Scanner sc = new Scanner(System.in);
   
   for(int i =0 ; i < metrix.length ; i++){

    for(int j =0 ; j <metrix[i].length ; j++){
        System.out.println("enter the value");
        metrix[i][j]= sc.nextInt();
    }
   }
   
System.out.println("elements");
for(int i = 0; i < metrix.length; i++) {
    for(int j = 0; j < metrix[i].length; j++) {
        System.out.print(metrix[i][j] + " ");
    }
    System.out.println();
}

    }
}