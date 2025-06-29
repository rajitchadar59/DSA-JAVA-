public class MethodOverloading {
    public static void main(String[] args) {
      Calculator cal = new Calculator();
     System.out.println("the sum is : "+cal.sum(2,3));
     System.out.println("the sum is : "+cal.sum(2,3,5));
     System.out.println("the sum is : "+cal.sum(2.5f,3.5f));
     System.out.println("the sum is : "+cal.sum(2.5f,3.5f,4.5f));



    }
}

class Calculator{

    int  sum(int a , int b){
        return a+b;
    }

    int sum(int a , int b , int c){
        return a+b+c;
    }
    
    float sum(float a , float b){
       return a+b;

    }

     float sum(float a , float b ,float c){
       return a+b+c;
       
    }
}
