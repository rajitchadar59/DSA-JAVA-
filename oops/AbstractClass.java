public  class AbstractClass {
public static void main(String[] args) {
  Horse h = new Horse();
   h.eat();
   h.walk();

   Chiken c = new Chiken();  
   c.eat();
   c.walk();

   System.out.println(h.color);
}

}


abstract  class Animal{
    String color;
   void eat(){
    System.out.println("animal eats");
   } 

   abstract void walk();

   Animal(){
    color="brown";
   }
}

class Horse extends Animal{
    void walk(){
        System.out.println("walks on four legs");
    }

    void changeColor(){
        color="white";

    }
}

class Chiken extends  Animal{
    void walk(){
        System.out.println("walk on two legs");
    }

     void changeColor(){
        color="yellow";
        
    }
}