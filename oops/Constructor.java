public class Constructor {
    public static void main(String[] args) {
       Student s1= new Student();
       s1.name="rajit";
       s1.roll=123;
       s1.password="abcd";
       s1.marks[0]=100;
       s1.marks[1]=90;
       s1.marks[2]=100;

       Student s2= new Student(s1);
       s2.password="xyz";
        s1.marks[2]=20;
       for(int i=0 ; i <3 ; i++){
        System.out.println(s2.marks[i]);
       }
    

    }
}

class Student{
String name;
int roll;
String password;
int marks[];
  //parametrized constructor
  Student(String name , int roll ){
     marks=new int[3];
    this.name=name;
    System.out.println("contructor called!");
  }

  Student (){
     marks=new int[3];
    System.out.println("non parametrized constructor");
  }

  /*copy constructor -- shallow copy

 Student(Student s1){
    marks=new int[3];
  this.name=s1.name;
  this.roll=s1.roll;
  this.marks=s1.marks;
 }

*/


 //deep copy
   Student (Student s1){
   marks=new int[3];
  this.name=s1.name;
  this.roll=s1.roll;
  for(int i =0 ; i <marks.length ; i++){
    this.marks[i]=s1.marks[i];
  }
   }
}