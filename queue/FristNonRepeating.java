import java.util.LinkedList;
import java.util.Queue;

public class FristNonRepeating {
    public static void fristNonRepeating(String str){
       int freq[]= new int[26];
       Queue<Character> q= new LinkedList<>(); 
       for(int i =0; i < str.length(); i++){
        char ch = str.charAt(i);
        q.add(ch);
        freq[ch-'a']++;
        while(!q.isEmpty()){
            if(freq[q.peek()-'a'] == 1){
                System.out.println(q.peek());
                break;
            }
            q.remove();
        }
        if(q.isEmpty()){
            System.out.println("-1");
        }
       } 
    }
    public static void main(String[] args) {
       String str="aabccxb";
       fristNonRepeating(str);
    }
}