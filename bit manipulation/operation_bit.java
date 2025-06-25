public class operation_bit {
    public static void get_ith_bit(int n ,int i){
     int bitmask= 1<<i;
     if((n & bitmask ) == 0){
        System.out.println("bit is 0");
     }else{
         System.out.println("bit is 1");
     }
    }

    public static int  set_ith_bit(int n , int i){
        int bitmask=1<<i;
        return n|bitmask;
    }

    public static int clear_ith_bit(int n , int i){
       int bitmask=~(1<<i);
       return bitmask&n; 
    }


    public static int  update_ith_bit(int n , int i ,int newBit ){
       /*  APPROCH -1
        if(newBit==0){
          return clear_ith_bit(n, i);  
        }else{
            return set_ith_bit(n, i);
        }

        */

       //APPROCH-2

        n=clear_ith_bit(n, i);
        int bitmask=newBit<<i;
        return n|bitmask;
       
    }
    public static void main(String[] args) {
        //get ith bit 
        get_ith_bit(10, 2);

        //set ith bit
       System.out.println(set_ith_bit(10,2));

       //clear ith bit
       System.out.println(clear_ith_bit(10, 1));

      //update ith bit
      System.out.println(update_ith_bit(10,2,1));
    }
}