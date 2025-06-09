public class prime_number {
    public static boolean  isPrime(int n){
       if(n==2){
        return true;
       }
       for(int i =2 ; i <= n-1 ; i++){
        if(n %i ==0){
            return false;
             
        }
       }
       return true;
    }


    public static boolean  optimized_isPrime(int n){
       if(n==2){
        return true;
       }
       for(int i =2 ; i <= Math.sqrt(n); i++){
        if(n %i ==0){
            return false;
             
        }
       }
       return true;
    }

     public static void prime_in_range(int n){

        for(int i =2 ; i <=n ; i++){
            if(optimized_isPrime(i)){
                System.out.print(i+" ");
            }
        }
     }




        public static void main(String[] args) {
        prime_in_range(100);
    }
}