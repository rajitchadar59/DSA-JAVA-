import java.util.*;
//  when size of an array is given
public class sizeofarraygiven{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        for(int a : arr){
            System.out.print(a+" ");
        }


        System.out.println("another way to print");


        System.out.println(Arrays.toString(arr)); //[1,2,3,4]


        sc.close();
    }
}