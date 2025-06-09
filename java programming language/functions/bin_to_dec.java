public class bin_to_dec {
    public static int btd(int n){  
        int power=0;
        int dec=0;

        while(n>0){
            int ld= n%10;
            dec=dec+(ld*(int)Math.pow(2,power));
            power++;
            n=n/10;
        }

        return dec;
    }


    public static int dtb(int n){
        int power=0;
        int bin=0;
        while(n>0){
            int rem= n%2;
            bin = bin +(rem*(int)Math.pow(10,power));
            power++;
            n=n/2;
        }
        return bin;

    }
    public static void main(String[] args) {            
       System.out.println("the binary form is "+dtb(2));
    }
}