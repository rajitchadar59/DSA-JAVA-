public class inverted_hp_withnum {
    public static void inverted_hp_withnumbers(){
        int n =5;
        for(int i =n ; i >=1 ; i--){
            for(int j=1 ; j <= i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       inverted_hp_withnumbers();
    }
}