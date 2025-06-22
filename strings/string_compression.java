public class string_compression {
    public static  String compress_string(String str){
        String s="";
        for(int i =0 ; i <str.length() ; i++){
            char ch = str.charAt(i);
            Integer count =1;
            while(i < str.length()-1 && str.charAt(i+1)==ch ){
            count++;
            i++;

            }

            s=s+ch;
            if(count >1){
                s=s+count.toString();
            }
        }
        return s;

    }
    public static void main(String[] args) {
        String str="abcd";
        System.out.println(compress_string(str));
    }
}