public class StringPermutation {
    public static void printPermutations(String str , String ans){
       if(str.length()==0){
        System.out.println(ans);
        return;
       }
     for(int i=0 ; i < str.length() ; i++){
        char curr= str.charAt(i);
        String newstr = str.substring(0,i)+str.substring(i+1);
        printPermutations(newstr, ans+curr);
     }

    }
    public static void main(String[] args) {

     String str="abc";  
     printPermutations(str, "");

    }
}
