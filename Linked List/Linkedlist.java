public class Linkedlist {
    public static class  Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }

    }  

    public static Node head;
    public static Node tail;
    public static int size;

   public void addFirst(int data){
    Node newnode = new Node(data);
    size++;
    if(head==null){
      head=tail=newnode;  
      return;
    }      

    newnode.next=head;
    head=newnode;

   }


  public void addLast(int data){
    Node newnode = new Node(data);
    size++;
    if(head ==null){
     head=tail=newnode;
     return;
    }
    
    tail.next=newnode;
    tail=newnode;

  }

  public void printLL(){
    if(head==null){
        System.out.println("linked list is empty ");
        return;
    }
    Node temp=head;
    while(temp != null){
        System.out.print(temp.data+"----->");
        temp=temp.next;

    }
    System.out.print("null");
  }


  public void add(int data , int idx){
    Node newnode= new Node(data);
    if(idx==0){
     addFirst(data);
     return;
    }
    size++;
    Node temp = head;
    int i=0;
    while(i < idx-1){
      temp=temp.next;
      i++;
    }

    newnode.next=temp.next;
    temp.next=newnode;

  }

  public void removeFirst(){
    if(size==0){
      System.out.println("linked list is empty");
      return;
    }else if(size==1){
      head=tail=null;
      size=0;
      return;
    }

    head= head.next;
    size--;
  }

  public void removeLast(){
      if(size==0){
      System.out.println("linked list is empty");
      return;
    }else if(size==1){
      head=tail=null;
      size=0;
      return;
    }

   Node temp=head;
   Node prev = null;
   while(temp.next != null){
    prev=temp;
    temp=temp.next;

   }
   
  
      prev.next=null;
      tail=prev;
      size--;
 
   
  }

  public int iterativeSearch(int key){
    Node temp=head;
     int i=0;

     while(temp != null){
      if(temp.data==key){
        return i;
      }
      i++;
      temp=temp.next;

     }
     return -1;

  }
  
    public static void main(String[] args) {
    
    Linkedlist ll= new Linkedlist();
    ll.addFirst(2);
    ll.addFirst(1);
    ll.addLast(3);
    ll.addLast(4);
   
    ll.printLL();
    System.out.println();
   System.out.println(ll.iterativeSearch(2));   
    }
}
