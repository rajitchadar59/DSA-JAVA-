public class Typepromotion {
    public static void main(String[] args) {
       char a= 'a';
       char b='b';

     //  char c= b-a ;  errror dega kyonki a and b expression hai or ye int main convert ho jayenge to hum int ko char main convert ni kar sakte lossy conversion hoga error dega typecaste kar sakte hai halaki
       System.out.println((int)b);
       System.out.println((int)a);
       System.out.println(b-a);


     //rule 2

     int x =10;
     float y= 20.25f;
     long z=30;
     double d = 30;
     double ans= x+y+z+d;
     System.out.println(ans);

    }
}