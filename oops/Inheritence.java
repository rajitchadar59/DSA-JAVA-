public class Inheritence {
    public static void main(String[] args) {
      Fish shark = new Fish();
      shark.eat();
    }
}


class Animal{
  String color;
  void eat(){
    System.out.println("eats");
  }  
}

class Fish extends  Animal{
int fins;

}