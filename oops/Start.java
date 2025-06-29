public class Start{
    public static void main(String[] args){
    // Pen p1=new Pen();
    // p1.setColor("blue");
    // System.out.println(p1.color);

    BankAccount newacc= new BankAccount();
    newacc.username="rajit";
    newacc.setpassword("rajitpass");
    System.out.println(newacc.getpassword());
    }
}

class Pen{
   String color;
   int tip;

   void setColor(String newcolor){
    color=newcolor;

   }

   void setTip(int newtip){
    tip=newtip;
   } 
}



class BankAccount{
   public  String username;
   private   String password;

   public void setpassword(String pwd){
    password=pwd;
   }

   public String getpassword(){
      return this.password;

   }
}