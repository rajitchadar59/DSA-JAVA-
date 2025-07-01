public class BinaryString {
    public static void printBinString(int n , int lastplace ,String sb){
        if(n==0){
        System.out.println(sb);
        return;
        }

        if(lastplace == 0){
        
         printBinString(n-1, 0, sb+"0");    
         printBinString(n-1, 1, sb+"1");

        }else{
         printBinString(n-1, 0, sb+"0");  
        }

    }
    public static void main(String[] args) {
     printBinString(3, 0, "");
    }
}