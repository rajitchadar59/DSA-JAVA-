import java.util.Scanner;
public class start {
    public static void change(int arr[]){
        arr[0]=10;
     
    }
    public static void main(String[] args) {
       //creating an array
       int arr[]= new int[5];
       int arr1[]={1,2,3};
       String[] names ={"rajit" ,"rahul"};

       //input in arrays

       int marks[]=new int[100];
       Scanner sc = new Scanner(System.in);
       marks[0]= sc.nextInt();
       marks[1]= sc.nextInt();
       marks[2]= sc.nextInt();


      System.out.println(marks[0]);
      System.out.println(marks[1]);
      System.out.println(marks[2]);
   

       //update
       marks[2]=100;  

      System.out.println(marks[2]);


      //passing array to function 
      int nums[]={1,2,3};
      change(nums);

      System.out.println("nums[0]="+nums[0]);
    }
}