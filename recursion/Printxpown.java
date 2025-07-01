public class Printxpown {
    public static int  printXPowerN(int x, int n){
        if(n==1){
            return x;
        }
       
       int xpnm1=printXPowerN(x, n-1);
       int xpn=x*xpnm1;
       return xpn;
    }


    public static int optimizedpower(int x, int n){
        if(n==0){
            return 1;
        }
        int halfpower=optimizedpower(x, n/2);
       // int halfpowersquare= optimizedpower(x, n/2)*optimizedpower(x, n/2);
       int halfpowersquare=halfpower*halfpower;
       if(n %2 != 0){
        halfpowersquare= x*halfpowersquare;
       }
       return halfpowersquare;
    }
    public static void main(String[] args) {
     System.out.println(optimizedpower(2,5));
    }
}