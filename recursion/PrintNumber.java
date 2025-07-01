public class PrintNumber {
    public static void printdesc(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printdesc(n-1);

    }

     public static void printinc(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
     printinc(n-1);
     System.out.println(n);


    }
    public static void main(String[] args) {
    //   printdesc(10); 
    printinc(10);
    }
}