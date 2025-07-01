public class RemoveDuplicateString {
    public static void remove_duplicates(String str ,StringBuilder sb , int idx , boolean map[]){
    if(idx==str.length()){
      return;
    } 

    char currChar=str.charAt(idx);

    if(map[currChar-'a']==true){
        remove_duplicates(str, sb, idx+1, map);
    }else{
      map[currChar-'a']=true;
        remove_duplicates(str, sb.append(currChar), idx+1, map);
    }


    }
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("");
        String str="apnacollege";
        boolean map[]=new boolean[26];
        remove_duplicates(str, sb, 0, map);
        System.out.println(sb);

    }
}