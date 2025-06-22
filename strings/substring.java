public class substring {
    public static void substrings(String str, int si , int ei){
       String substr="";
       for(int i = si; i < ei ; i++){
        substr=substr+str.charAt(i);
       }
       System.out.println(substr);
    }

    public static void main(String[] args) {
     String str="helloworld";
     System.out.println(str.substring(0, 5));
    //  substrings(str, 0,5);

    }
}