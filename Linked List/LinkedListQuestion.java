

public class LinkedListQuestion {
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
  
  public int recursiveSearch(Node head , int key ,int i){
    if(head==null){
        return -1;

    }

    

    if(head.data == key){
        return i;
    }

    return recursiveSearch(head.next, key , i+1);
  }


  public void reverseLL(){
    Node pre = null;
    Node curr= tail = head;
    
    while(curr != null){
      Node next = curr.next;
      curr.next=pre;
      pre=curr;
      curr=next;
    }

    head=pre;
    
      }

     public void deleteNthFromEnd(int n){
      
      int size =0;
      Node temp= head;
      while(temp != null){
        size++;
        temp=temp.next;

      }

      if(n==size){
       head= head.next;
       return;

      }

      int i =1;
      Node prev=head;
      while(i < size-n){
      prev=prev.next;
      i++;
      }

      prev.next=prev.next.next;

     }


     public Node findMid(Node head){
      Node slow=head;
      Node fast = head;
      while(fast != null && fast.next != null){
        slow=slow.next;
        fast = fast.next.next;
      }

      return slow;
      
     }


    public boolean checkPalindrome(){
      if(head==null || head.next==null){
        return true;

      }

      Node middleNode=findMid(head);

      Node pre=null;
      Node curr=middleNode;
      while(curr != null){
        Node next = curr.next;
        curr.next=pre;
        pre=curr;
        curr=next;
      }

      Node rightHead=pre;
      Node leftHead=head;
      
      while(rightHead != null){
        if(rightHead.data != leftHead.data){
          return false;
        }

        rightHead=rightHead.next;
        leftHead=leftHead.next;


      }
      
      return true;

    }
    public static void main(String[] args) {
    
    LinkedListQuestion ll= new LinkedListQuestion();
    ll.addFirst(2);
    ll.addFirst(10);
    ll.addLast(2);
    ll.addLast(10);
  
    ll.printLL();
    System.out.println(ll.checkPalindrome());
  //   ll.reverseLL(); 
  //   System.out.println();
  //  ll.printLL();

   
    }
}
